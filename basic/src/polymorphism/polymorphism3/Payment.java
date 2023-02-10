package polymorphism.polymorphism3;

public class Payment {
    public void pay() {
        System.out.println("Payment completed");
    }

    public void printInstallment(double totalAmount) {
        System.out.println("Payment class: Installment amount in Double: " + totalAmount / 5);
    }
}
