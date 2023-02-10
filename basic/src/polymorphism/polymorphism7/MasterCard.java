package polymorphism.polymorphism7;

public class MasterCard extends CreditCard {

    @Override
    public void pay() {
        System.out.println("Payment by Master Card completed");
    }

}
