package Statement;

public class SwitchState {
    public static void kentang(){
        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Very good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;
            case 'E':
                System.out.println("Wake up");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("this  is invalid grade");

        }
        System.out.println("Your grade is " + grade);
    }
}
