package looping;

public class DoWhileLooping {
    public static void main(String[] args) {
        int counter = 0;
        do{
            counter++;
            System.out.println(counter);
        }while(counter < 5);

        counter = 0;
        int originalNumber = 20;

        int tempNumber = originalNumber;
        
        do{
            counter++;
            tempNumber -= 3;
            System.out.println("Calculated number is " + tempNumber);
            System.out.println("Iteration number is " + counter);
            System.out.println("------------------------------------");
        }while(tempNumber > originalNumber / 2);
        System.out.println("Number Of iterations to get half or less " + counter);
    }
}
