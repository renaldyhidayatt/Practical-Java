package lame.Methods;

public class ValueOfMethod {
    public static void kentang() {
        Integer a = Integer.valueOf(4);
        Double b = Double.valueOf(18);
        Float c = Float.valueOf("48");
        Integer d = Integer.valueOf("800", 18);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
