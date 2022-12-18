package structural_patterns.decorator_patterns;

public class App_Decorator {
    public static void kentang() {
        Machine machine = new Navigation(new ParkingAssistant(new Car()));
        System.out.println(machine.doOperation());
    }
}
