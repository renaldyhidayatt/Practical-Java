package SimpleProjects;

class First{
    int x, y;
    First(int a, int b){
        x = a;
        y = b;
    }

    void display(){
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}

class Second extends First{
    int z;
    Second(int a, int b, int c){
        super(a, b);
    }

    void display(){
        super.display();
        System.out.println("z:" + z);
    }
}

public class MethodOverriding {
    public static void kentang(){
        Second sc = new Second(100,200,300);
        sc.display();
    }
}
