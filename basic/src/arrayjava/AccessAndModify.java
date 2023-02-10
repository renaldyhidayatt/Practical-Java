package arrayjava;

public class AccessAndModify {
    public static void main(String[] args) {
        double[] myDoubles= new double[5];
        System.out.println(myDoubles[0]);

        System.out.println(myDoubles[1]);

        myDoubles[4]=5.5;

        System.out.println(myDoubles[4]);

        double myDoubleValue=myDoubles[4];
        System.out.println(myDoubleValue);
    }
}
