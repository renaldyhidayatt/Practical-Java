package controlstatement;

public class SwitchJava {
    public static void main(String[] args) {
        int dayNumber = 0;
        switch (dayNumber) {
            case 0:
                System.out.println("Sunday");
                System.out.println("Today is holiday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println("Today is holiday");
                break;
            default:
                System.out.println("Wrong day number. Please enter a day " +
                        "number in between 0 and 6");
        }

        String day = "Monday";
        switch (day) {
            case "Sunday":
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Wrong day name");
                break;
        }
    }
}
