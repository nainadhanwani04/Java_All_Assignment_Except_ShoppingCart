/**
 * Created by nainadhanwani on 1/27/17.
 */
public class StackProgram {
    public static int min;
    public int max;
    String[] dataStorage;

public StackProgram(){
min=-1;
max=5;
dataStorage=new String[max];
}

public void push(String data)
{
    if(min==max - 1)
    {
        System.out.println("Maximum storage reached");
    }
    else
    {
        dataStorage[++min]=data;
        System.out.println(dataStorage[+min]);
    }
}
public void pop()
{
    if(min==-1)
    {
        System.out.println("Lowest value reached");
    }
    else
    {
        System.out.println(dataStorage[min--]);
    }
}

    public static void main(String[] args) {
        StackProgram s=new StackProgram();
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
