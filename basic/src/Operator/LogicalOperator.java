package Operator;

public class LogicalOperator {
    public static void kentang(){
        boolean a = true;
        boolean b = false;

        System.out.println("A && B = " + (a&&b));
        System.out.println("A || B = " + (a||b));
        System.out.println("!(A&&B) = " + !(a && b));
    }
}
