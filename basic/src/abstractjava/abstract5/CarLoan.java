package abstractjava.abstract5;

public class CarLoan extends Loan{
    public CarLoan(String customerId, double amount, int length) {
        super(customerId, amount, length);
    }

    @Override
    public boolean apply() {
        System.out.println("Customer " + getCustomerId() + " applied for " +
                "car" +
                " " +
                "loan");
        return true;
    }

    @Override
    public void pay() {
        System.out.println(getAmount() + " paid to the car loan customer");
    }

    @Override
    public boolean repay(double amount) {
        System.out.println(amount + " car loan repaid");
        return true;
    }
}
