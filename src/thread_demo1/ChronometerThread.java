package thread_demo1;

public class ChronometerThread implements Runnable {
    private Thread thread;
    private String threadName;
     public ChronometerThread(String threadName){
         this.threadName = threadName;
         System.out.println("thread = " + threadName+ " is being created. olusturuluyor ");
     }
    @Override
    public void run() {
        System.out.println("Running (Calistiriliyor) = " + threadName);
        for (int i = 0; i <10 ; i++) {
            System.out.println(threadName+ " : "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(" Cut - Kesildi"+ threadName);
            }
            System.out.println("Thread completed (Sonlandi)"+threadName);
        }
    }//first implement Runnable interface
}
