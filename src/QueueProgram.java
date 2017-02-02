/**
 * Created by nainadhanwani on 2/1/17.
 */
public class QueueProgram {
    int arr[] = new int[3];
    int top = -1;
    int rear = 0;

    public void push(int pushedElement) {
        if (top <  2) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed Element:"+arr[top]);
        } else {
            System.out.println("Overflow");
        }

    }

    public void pop() {
        if (top >= rear) {
            System.out.println("Popped Element:"+arr[rear]);
            rear++;

        } else
            System.out.println("Underflow");
    }


    public static void main(String[] args) {
        QueueProgram queueDemo = new QueueProgram();
        queueDemo.pop();
        queueDemo.push(3);
        queueDemo.push(2);
        queueDemo.push(7);
        queueDemo.push(1);
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
    }

    }


