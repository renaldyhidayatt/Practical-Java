package SimpleProjects;

class FirstFunction{
    int x;
    public FirstFunction(int x){
        this.x = x;
    }

    protected void finallize() throws Throwable{
        System.out.println("Welcome to Finalize Keyword in Java Programming " + x);
    }
}

public class FinalFunction {
    public static void kentang(){
        FirstFunction f1 = new FirstFunction(100);
        FirstFunction f2 = new FirstFunction(200);

        f1 = f2;
        System.gc();
        System.out.println("Hello World");

    }
}
