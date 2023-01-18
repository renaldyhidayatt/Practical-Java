package lame.EnumLecture;

class Shoes {
    enum ShoeType {
        Male, Famele, Kids
    }

    ShoeType type;
}

public class LetsEnum {
    public static void kentang() {
        Shoes niceshoes = new Shoes();
        niceshoes.type = Shoes.ShoeType.Kids;

        System.out.println("type: " + niceshoes.type);

    }
}
