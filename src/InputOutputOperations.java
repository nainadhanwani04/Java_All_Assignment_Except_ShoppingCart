import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by nainadhanwani on 1/31/17.
 */
public class InputOutputOperations {

    public static void CreateFile() throws IOException
    {
        File directory=new File("/Users/nainadhanwani/projects/TestFolder");
        if(!directory.exists())
        {
            directory.mkdir();
            File file1 = new File("/Users/nainadhanwani/projects/TestFolder/testFile.txt");
                file1.createNewFile();
                System.out.println("File created successfully");
                throw new IOException();
        }

    }

    public static void WriteFile() throws IOException
    {
        File file1 =  new File("/Users/nainadhanwani/projects/TestFolder/testFile.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        FileWriter fileWriter = new FileWriter(file1,true);                         // Using FileWriter
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);                    //  Using BufferedWriter
        printWriter.write("My name is Naina."+"\n");
        fileWriter.write("I love coding");
        System.out.println("Data added successfully");
        printWriter.flush();
        bufferedWriter.flush();
        fileWriter.flush();
        printWriter.close();
        fileWriter.close();
        bufferedWriter.close();
        throw new IOException();
    }
    public static void ReadFile() throws IOException{
        File file1 =  new File("/Users/nainadhanwani/projects/TestFolder/testFile.txt");
        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readData;
        while ((readData = bufferedReader.readLine()) != null)
        {
            System.out.println(readData);
        }
        fileReader.close();
        bufferedReader.close();

    }

    public static void main(String[] args) {
        try {
              CreateFile();
              WriteFile();
              ReadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
