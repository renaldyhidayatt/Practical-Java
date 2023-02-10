package arrayutils.arrayutils1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copy = Arrays.copyOf(original, original.length + 5);
        System.out.println(Arrays.toString(copy));

        copy = Arrays.copyOf(original, original.length / 2);
        System.out.println(Arrays.toString(copy));
       
        copy = Arrays.copyOfRange(original, 5, 8);
        System.out.println(Arrays.toString(copy));

    }
}
