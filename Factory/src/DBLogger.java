public class DBLogger implements Logger{

    @Override
    public void log(String msg) {
        System.out.println("Printing from database: \n" + msg);
    }
}
