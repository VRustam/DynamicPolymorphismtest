package dersler;

public class DynamicPolymorphismtest {
    public static void main(String[] args) {
    Animals animals = new Animals();
    animals.sayName();
    Animals qartal = new Qartal();
        ((Qartal)qartal).uc();
    qartal.sayName();

    Animals panda = new Panda();
    panda.sayName();
        ((Panda)panda).oynamaq();
    }

    public static Animals rastgelesec(){

        int sec = (int)(Math.random()*3);
        Animals animals;
         if (sec == 0 ){
             animals = new Animals();
         }else if(sec == 1){
             animals = new Qartal();
         }else {
             animals = new Panda();
         }
        return animals;
    }
}

class Animals{
    public void sayName(){
        System.out.println(" Men bir heyvan sinifiyem");
    }
}
class Qartal extends Animals{
    @Override
    public void sayName() {
        System.out.println(" Men bir Qartal sinifiyem");
    }
    public void uc(){
        System.out.println(" uca bilirem");
    }
}
class Panda extends Animals{
    @Override
    public void sayName() {
        System.out.println(" Men bir Panda sinifiyem");
    }
    public void oynamaq(){
        System.out.println(" oynayanam");
    }
}
