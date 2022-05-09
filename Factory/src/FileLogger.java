import java.io.EOFException;
import java.io.File;
//Can't find the org.apache.commons.io.FileUtils import

public class FileLogger implements Logger{
    @Override
    public void log(String msg) {
        System.out.println("Printing from file: \n" + msg);
    }
}
