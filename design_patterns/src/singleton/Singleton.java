package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void logMessageStart() {
        System.out.println("Start message Logged");
    }

    public void logMessageStop() {
        System.out.println("Stop Message is logged");
    }
}
