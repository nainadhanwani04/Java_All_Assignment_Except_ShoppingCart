import java.util.LinkedList;

/**
 * Created by nainadhanwani on 1/31/17.
 */

public class LinkedListProgram{
        Node Head;

        class Node
        {
            int data;
            Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public void addNode(int data){
            Node n=new Node(data);

            if(Head==null)
            {
                Head=n;
            }
            else {
                n.next = Head;
                Head = n;
            }
        }

    public void middleElement(){
        Node Pointer1=Head;
        Node Pointer2=Head;
        while(Pointer2.next!=null){
           Pointer1=Pointer1.next;
            Pointer2=Pointer2.next.next;
        }
        System.out.println(" Middle Element:"+Pointer1.data);
    }
        public void display(){

            Node next=Head;

            while(next!=null){

                System.out.print("Node " + next.data+"\t");
                next=next.next;
            }

        }
        public static void main(String[] args) {

            LinkedListProgram newNode=new LinkedListProgram();

            newNode.addNode(4);
            newNode.addNode(6);
            newNode.addNode(7);
            newNode.middleElement();
            newNode.display();
        }
    }