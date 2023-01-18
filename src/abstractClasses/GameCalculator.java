package abstractClasses;

public abstract class GameCalculator { //  abstract keyword makes a class abstract
    // abstract classes may have both abstract and concrete methods

    public void start(){
        System.out.println(" The game is started -- Oyun Basladi= " );
    }
    public abstract void hesapla(); // Abstract methods CANNOT have a body


    public final void gameOver(){
        System.out.println("Game Over --  Oyun Bitti");
    }
}
