package threading.odd_even;

public class EvenThread implements Runnable{
    private Thread myThread;
    public EvenThread() throws InterruptedException {
        myThread = new Thread(this, "my runnable thread");
        myThread.start();
        myThread.join();
    }
    public Thread getMyThread() {
        return myThread;
    }
    public void run() {
        try {
            for (int i  =1; i <= 10; i++) {
                if(i%2!=0) {
                    System.out.println("Printing the count " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("EvenThread: my thread interrupted");
        }
        System.out.println("EvenThread: my thread run is over");
    }

}
