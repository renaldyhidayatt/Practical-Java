package SimpleProjects;

class FirstSuperClass{
    int x, y;
    FirstSuperClass(int a, int b){
        x = a;
        y = b;
    }

    void show(){
        System.out.println("Value of X is : " + x);
        System.out.println("Value of Y is : " + y);
    }
}

class SecondSuperClass extends FirstSuperClass{
    int z;
    SecondSuperClass(int a, int b, int c){
        super(a, b);
        z = c;
    }

    void show(){
        super.show();
        System.out.println("Value of Z is : "  + z);
    }
}

public class SuperClass {
    public static void kentang(){
        SecondSuperClass fs = new SecondSuperClass(100,200,300);
        fs.show();
    }
}
