package polymorphism.polymorphism6;

public class VisaCard extends CreditCard{

    @Override
    public void pay() {
        System.out.println("Payment by Visa Card completed");
    }
}
