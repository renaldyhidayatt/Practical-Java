package controlstatement;

public class Ifnested {
    public static void main(String[] args) {
        
        int studentId = 100;
        boolean hasGlasses = false;
        int height = 61;

        System.out.println("Student Id: " + studentId);
        if (!hasGlasses) {
            if (height >= 60) {
                
                System.out.println("Student is eligible");
            } else {
                System.out.println("Student is shorter than 60 inches not " +
                        "eligible");
            }
        } else {
            System.out.println("Student has glasses, not eligible");
        }
    }
}
