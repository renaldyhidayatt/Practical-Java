package genericjava.generic13;


public class Main {

    public static <T> void printA(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
    public static <T extends Number> void printB(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
    }
}
