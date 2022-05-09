//import java.io.IOException;
//import java.util.Properties;

public class LoggerFactory {
//    public boolean isFileLoggingEnabled() {
//        Properties p = new Properties();
//        try {
//            p.load(ClassLoader.getSystemResourceAsStream(
//                    "Logger.properties"));
//            String fileLoggingValue =
//                    p.getProperty("FileLogging");
//            if (fileLoggingValue.equalsIgnoreCase("ON") == true) {
//                return true;
//            } else {
//                return false;
//            }
//        } catch (IOException e) {
//            return false;
//        }
//    }

    public Logger getLogger(String type) {
        if (type.equalsIgnoreCase("File")) {
            return new FileLogger();
        } else if (type.equalsIgnoreCase("Console")) {
            return new ConsoleLogger();
        } else if(type.equalsIgnoreCase("Database")){
            return new DBLogger();
        }
        return null;
    }
}
