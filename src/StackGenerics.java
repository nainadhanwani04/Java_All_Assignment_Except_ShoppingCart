import java.util.*;
public class StackGenerics<T> {
    public static int min;
    public int max;
    private ArrayList<T> stack = null;

    public StackGenerics(int size) {
        min = -1;
        max = size;
        stack = new ArrayList <T>(size);
    }

    public void push(T data) {
        if ( min == max - 1 ) {
            System.out.println("Maximum storage reached");
        } else {
            stack.add(++min,data);
        }
    }

    public void pop() {
        if ( min == -1 ) {
            System.out.println("Lowest value reached");
        } else {
            System.out.println(stack.remove(min--));
        }
    }

    public static void main(String[] args) {
        StackGenerics<String> s = new StackGenerics <>(5);
        s.push("I");
        s.push("work");
        s.push("in");
        s.push("App");
        s.push("Direct");
        s.push("only");
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
