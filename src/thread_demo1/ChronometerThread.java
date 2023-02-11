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

            try {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(threadName + " : " + i);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println(" Cut - Kesildi"+ threadName);
            }
            System.out.println("Thread completed (Sonlandi)"+threadName);
        }
public void start(){
    System.out.println("Thread object is being started : tread nesnesi olusturuluyor");
    if(thread==null){
        thread = new Thread(this, threadName);
        thread.start();
    }
}
    }

