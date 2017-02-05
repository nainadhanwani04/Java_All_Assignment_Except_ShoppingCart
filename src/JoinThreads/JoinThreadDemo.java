package JoinThreads;

/**
 * Created by nainadhanwani on 2/2/17.
 */
public class JoinThreadDemo implements Runnable {
    @Override
    public void run() {

        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
    }
