package ProducerConsumer;

/**
 * Created by nainadhanwani on 2/5/17.
 */
public class ProduceConsumeClient {
    public static void main(String[] args) throws InterruptedException {

        LinkList linkList = new LinkList();

        // Create producer thread
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    linkList.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    linkList.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

}

