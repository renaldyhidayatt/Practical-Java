package polymorphism.polymorphism5;

public class Bitcoin extends Payment {

    public int maxDiscountRatio=3;

    
    public static String getAccountNumber(){
        return "Bitcoin Account:00000123";
    }

    @Override
    public void pay() {
        System.out.println("Bitcoin class: Payment by Bitcoin completed in");
    }

    public void printInstallment(int totalAmount) {
        System.out.println("Bitcoin class: Installment amount in Integer: " + totalAmount / 5);
    }


}
