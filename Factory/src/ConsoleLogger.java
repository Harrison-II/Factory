public class ConsoleLogger implements Logger{

    @Override
    public void log(String msg) {
        System.out.println("Printing from console: \n" + msg);
    }
}
