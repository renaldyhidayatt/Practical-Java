package arrayutils.arrayutils3;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] namesA = {"Micheal", "John", "Chris"};
        String[] namesB = {"Micheal", "John", "Adam"};
        System.out.println(Arrays.equals(namesA, namesB));

        
        System.out.println(Arrays.compare(namesA, namesB));

        int[] positiveIntegers = {1, 3, 5, -1};
        int[] negativeIntegers = {1, 3, 5, -7};
        System.out.println(Arrays.compareUnsigned(positiveIntegers,
                negativeIntegers));
        System.out.println(Arrays.mismatch(positiveIntegers, negativeIntegers));
        
        Object[] objectsA = {1, 2, new BigDecimal(3)};
        Object[] objectsB = {1, 2, new BigDecimal(3)};

        System.out.println(Arrays.deepEquals(objectsA, objectsB));
        System.out.println(Arrays.equals(objectsA, objectsB));
        System.out.println(Arrays.deepToString(objectsA));
        System.out.println(Arrays.toString(objectsA));

    }
}
