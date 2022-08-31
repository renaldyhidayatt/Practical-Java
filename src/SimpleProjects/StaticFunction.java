package SimpleProjects;

public class StaticFunction {
    int Reg_No;
    String Name;
    static String Company = "SanEdge";

    StaticFunction(int a, String b){
        Reg_No = a;
        Name = b;
    }

    void display(){
        System.out.println("Your details are: " + Reg_No + " " + Name + " " + Company);
    }

    public static void kentang(){
        StaticFunction em = new StaticFunction(200, "Ejike");
        em.display();
    }
}
