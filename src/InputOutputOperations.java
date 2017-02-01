import java.io.File;

/**
 * Created by nainadhanwani on 1/31/17.
 */
public class InputOutputOperations {

    public static void CreateFile()
    {
        File directory=new File("Users/Naina Dhanwani/projects");
        if(!directory.exists())
        {
            directory.mkdir();
            File f1=new File("");
        }

    }

}
