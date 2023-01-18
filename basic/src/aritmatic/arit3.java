package aritmatic;

public class arit3 {
    public static void kentang() {
        int numA = 2;
        int numB = numA << 2;

        System.out.println(numA + " = " + Integer.toBinaryString(numA));
        System.out.println(numB + " = " + Integer.toBinaryString(numB));

        numB = numA >> 1;
        System.out.println(numA + " = " + Integer.toBinaryString(numA));
        System.out.println(numB + " = " + Integer.toBinaryString(numB));

        numA = -2;
        numB = numA >> 1;
        System.out.println(numA + " = " + Integer.toBinaryString(numA));
        System.out.println(numB + " = " + Integer.toBinaryString(numB));

        numA = 2;
        numB = numA >>> 1;
        System.out.println(numA + " = " + Integer.toBinaryString(numA));
        System.out.println(numB + " = " + Integer.toBinaryString(numB));

        numA = -2;
        numB = numA >>> 1;
        System.out.println(numA + " = " + Integer.toBinaryString(numA));
        System.out.println(numB + " = " + Integer.toBinaryString(numB));
    }
}
