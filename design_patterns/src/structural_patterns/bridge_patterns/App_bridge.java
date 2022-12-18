package structural_patterns.bridge_patterns;

public class App_bridge {
    public static void kentang() {
        Bag redBag = new Bag(new Red());
        Bag blueBag = new Bag(new Blue());

        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());

        redBag.getColour();
        blueBag.getColour();

        redPurse.getColour();
        bluePurse.getColour();
    }
}
