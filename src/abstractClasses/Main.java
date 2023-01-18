package abstractClasses;
//  abstract keyword makes a Class abstract
// abstract keyword makes a method() abstract
// abstract classes may have both abstract and concrete methods
// in an abstract class an abstract method is not necessary
//There must be at least one complete action (Method etc)
//abstract methods in an abstract class must be OVERRIDDEN in all extended (inherited) classes
// cannot create abs =new (); never! @override annotation
//abstract methods in abstract class are compulsory  to override for all extended classes
public class Main {
    public static void main(String[] args) {
MaleGameCalculator maleGameCalculator = new MaleGameCalculator();

maleGameCalculator.start();
maleGameCalculator.hesapla();
maleGameCalculator.gameOver();

      //  GameCalcculator gameCalculator = new FemaleGameCalculator();
      //  GameCalcculator gameCalculator = new ElderlyGameCalculator();
        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();



    }

}
