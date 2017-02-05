package JoinThreads;

/**
 * Created by nainadhanwani on 2/2/17.
 */
public class JoinThreadDemoClient {
    public static void main(String[] args) {

        JoinThreadDemo joinThreadDemo = new JoinThreadDemo();
        Thread thread1 = new Thread(joinThreadDemo);
        Thread thread2 = new Thread(joinThreadDemo);
        thread1.start();
              try {
                  thread1.join();
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
        thread2.start();

              System.out.println("All threads are dead, exiting main thread");


    }
}
