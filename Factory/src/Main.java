public class Main {
    public static void main(String[] args){
        Logger logr = new LoggerFactory().getLogger("file");
        logr.log("Hey there this is my message");
    }
}
