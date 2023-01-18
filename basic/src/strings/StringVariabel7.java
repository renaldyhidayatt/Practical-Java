package strings;

public class StringVariabel7 {
    public static void kentang() {
        int myIntVal = 15;
        byte myByteVal = (byte) myIntVal;
        System.out.println("Mybyte = " + myByteVal);

        myIntVal = 257; // is bigger than max byte value
        myByteVal = (byte) myIntVal;
        System.out.println(" myByteVal = " + myByteVal);

        myIntVal = 255;
        myByteVal = (byte) myIntVal;
        System.out.println(" myByteVal = " + myByteVal);

        float myFloatVal = 10.33f;
        long myLongVal = (long) myFloatVal;
        System.out.println("myLongVal = " + myLongVal);

        double myDoublePI = 3.142857142857143f;
        float myFloatPI = (float) myDoublePI;
    }
}
