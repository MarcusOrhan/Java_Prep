package thread_demo1;

public class main {
    public static void main(String[] args) {
        ChronometerThread threadA = new ChronometerThread("Thread A");
        ChronometerThread threadB = new ChronometerThread("Thread B");
        ChronometerThread threadC = new ChronometerThread("Thread C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
