package abstractjava.abstract5;

public abstract class Loan {
    final static double maxTotalLoan = 300_000_000;

    private double amount;
    private String customerId;
    private int length;

    public Loan(String customerId, double amount, int length) {
        setCustomerId(customerId);
        setAmount(amount);
        setLength(length);
    }

    public Loan() {
    }

    public static double calcRepaymentAmount(double amount,double interestRate, int length) {

        return amount + amount * interestRate * length / 12;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public abstract boolean apply();

    public abstract void pay();

    public abstract boolean repay(double amount);

    private boolean checkLoanHistory() {
        System.out.println("Loan history is checking...");
        return true;
    }

    private boolean checkCreditCardHistory() {
        System.out.println("Credit card history is checking...");
        return true;
    }

    public final boolean checkCreditHistory() {
        if (!checkLoanHistory()) return false;
        if (!checkCreditCardHistory()) return false;
        System.out.println("Credit History Check Completed for the customer: "
                + getCustomerId());
        return true;
    }
}
