package ProducerConsumer;
import java.util.LinkedList;

/**
 * Created by nainadhanwani on 2/5/17.
 */
public class LinkList {

    LinkedList<Integer> list = new LinkedList<>();                      // Create a list shared by producer and consumer
    static final int capacity = 2;
    // Size of list is 2.
    public void produce() throws InterruptedException{
        int value = 0;
        while (true)
        {
            synchronized (this)
            {
                // producer thread waits while list
                // is full
                while (list.size()==capacity)
                    wait();

                System.out.println("Producer produced-"
                        + value);

                // to insert the jobs in the list
                list.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException{
        while (true)
        {
            synchronized (this)
            {
                // consumer thread waits while list
                // is empty
                while (list.size()==0)
                    wait();

                //to retrive the ifrst job in the list
                int val = list.removeFirst();

                System.out.println("Consumer consumed-"
                        + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}

