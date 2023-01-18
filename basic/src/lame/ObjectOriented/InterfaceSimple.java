package lame.ObjectOriented;

interface Output {
    void display();
}

public class InterfaceSimple implements Output {
    public void display() {
        System.out.println("This Example");
    }

    public static void kentang() {
        InterfaceSimple face = new InterfaceSimple();
        face.display();
    }
}
