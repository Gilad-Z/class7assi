import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class writelog {


    private static writelog instance = null;

    private writelog(){}

    public static writelog getInstance(){
        if (instance== null){
            instance = new writelog();
        }
        return instance;
    }


    public void writelogs(String content) throws IOException{
        String filepath = "c:\\QA course\\log.txt";
      //  Files.readString(Path.of(filepath));

        Files.writeString(Path.of(filepath), content, StandardOpenOption.APPEND);


    }
}


