package polymorphism.polymorphism3;

public class MyPayment {
    public static void main(String[] args) {
        Payment bitcoin = new Bitcoin();

        bitcoin.pay();

        bitcoin.printInstallment(120);
    }
}
