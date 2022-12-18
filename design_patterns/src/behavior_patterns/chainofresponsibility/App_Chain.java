package behavior_patterns.chainofresponsibility;

public class App_Chain {
    public static void kentang() {
        Handler handler = new AuthenticationHandler();

        handler.handleRequest();

        InventoryBackend inventoryBackend = new InventoryBackend();

        inventoryBackend.takeOrder("Iphone", 1);
        inventoryBackend.takeOrder("Laptop", 2);
        inventoryBackend.takeOrder("Smart TV", 3);
        inventoryBackend.takeOrder("Iphone", 4);
        inventoryBackend.takeOrder("Laptop", 5);
        inventoryBackend.takeOrder("Smart TV", 6);

    }
}
