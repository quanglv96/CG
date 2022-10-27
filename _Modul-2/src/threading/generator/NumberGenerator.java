package threading.generator;

public class NumberGenerator implements Runnable {
    private Thread myThread;
    public NumberGenerator(){
        myThread = new Thread(this, "my runnable thread");
        myThread.start();
    }
    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the generator " + i+" HashCode: "+(String.valueOf(i)).hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

}
