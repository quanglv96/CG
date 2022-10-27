package threading.numberPrime;

public class LazyPrimeFactorization implements Runnable {
    private Thread myThread;

    public LazyPrimeFactorization() {
        myThread = new Thread(this, "my runnable thread");
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Lazy Prime Factorization " + i);

                    Thread.sleep(100);
                }
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lazy Prime Factorization run is over");
    }

}
