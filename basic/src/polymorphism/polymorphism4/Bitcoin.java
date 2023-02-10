package polymorphism.polymorphism4;

public class Bitcoin extends Payment {

   
    @Override
    public void pay() {
        System.out.println("Bitcoin class: Payment by Bitcoin completed in");
    }

    
    public void printInstallment(int totalAmount) {
        System.out.println("Bitcoin class: Installment amount in Integer: " + totalAmount / 5);
    }
}
