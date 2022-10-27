package threading.odd_even;

public class OddThread implements Runnable{
    private Thread myThread;
    public OddThread() throws InterruptedException {
        myThread = new Thread(this, "my runnable thread");
        myThread.start();
        myThread.join();
    }
    public Thread getMyThread() {
        return myThread;
    }
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if(i%2==0) {
                    System.out.println("Printing the count " + i);
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(" my thread interrupted");
        }
        System.out.println("OddThread: my thread run is over");
    }

}
