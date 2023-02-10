package polymorphism.polymorphism5;

public class Cheque extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment by Cheque completed");
    }
}
