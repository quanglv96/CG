package threading.numberPrime;

public class OptimizedPrimeFactorization implements Runnable {
    private Thread myThread;

    public OptimizedPrimeFactorization() {
        myThread = new Thread(this, "my runnable thread");
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try{
        for (int i = 2; i < 100; i++) {
            int count = 0;
            int k= (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Optimized Prime Factorization " + i);
                Thread.sleep(100);
            }
        }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Optimized Prime Factorizatio run is over");
    }
}
