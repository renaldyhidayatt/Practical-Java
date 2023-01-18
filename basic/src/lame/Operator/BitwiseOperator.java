package lame.Operator;

public class BitwiseOperator {
    public static void kentang() {
        int a = 20;
        int b = 15;
        int c;
        c = a & b;

        System.out.println("A & B" + c);
        c = a | b;
        System.out.println("A | B" + c);
        c = a ^ b;
        System.out.println("A ^ B" + c);

        c = a << 3;
        System.out.println("A << 3" + c);

        c = b >> 2;
        System.out.println("B >> 2" + c);
    }
}
