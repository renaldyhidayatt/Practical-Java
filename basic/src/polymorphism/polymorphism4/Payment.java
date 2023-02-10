package polymorphism.polymorphism4;

public class Payment {
    public void pay() {
        System.out.println("Payment class: Payment completed");
    }

    public void printInstallment(double totalAmount) {
        System.out.println("Payment class: Installment amount in Double: " + totalAmount / 3);
    }
}
