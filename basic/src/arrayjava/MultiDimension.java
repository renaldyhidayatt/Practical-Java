package arrayjava;

public class MultiDimension {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;

        int[][] myTwoDimArray = new int[rows][columns];
        int value = 0;
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columns; columnIndex++) {
                myTwoDimArray[rowIndex][columnIndex] = value++;
            }
        }

        for (int rowIndex = 0; rowIndex < myTwoDimArray.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < myTwoDimArray[rowIndex].length; columnIndex++) {
                System.out.println("myTwoDimArray[" + rowIndex + "][" + columnIndex + "]: "
                        + myTwoDimArray[rowIndex][columnIndex]);
            }
        }

        int[][] myTwoDimArrayB = { { 0, 1, 2 }, { 3, 4, 5 } };
        for (int rowIndex = 0; rowIndex < myTwoDimArrayB.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < myTwoDimArrayB[rowIndex].length; columnIndex++) {
                System.out.println("myTwoDimArray[" + rowIndex + "][" + columnIndex + "]: "
                        + myTwoDimArrayB[rowIndex][columnIndex]);
            }
        }

        for (int[] myRows : myTwoDimArray) {
            for (int number : myRows) {
                System.out.println(number);
            }
        }

        int[][][] myThreeDimArray = { { { 0, 1, 2 }, { 3, 4, 5 } }, { { 6, 7, 8 }, { 9,
                10, 11 } } };
        // we will now print each element in a for each loop
        // since we will traverse a three dimensional array we need 3-level
        // nested loop
        for (int[][] twoDArray : myThreeDimArray)
            for (int[] myRows : twoDArray)
                for (int number : myRows)
                    System.out.println(number);
    }
}
