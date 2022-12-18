package SimpleProjects;


class Hello{
    final void display(){
        System.out.println("This final method");
    }
}

public class Finalkeywordd extends Hello {
    public static void kentang(){
        Hello h1 = new Hello();
        h1.display();
    }
}

