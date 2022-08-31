package design_patterns.singleton;

public class App_singleton {
    public static void kentang(){
        Singleton singleton = Singleton.getInstance();
        singleton.logMessageStart();
        singleton.logMessageStop();
    }
}
