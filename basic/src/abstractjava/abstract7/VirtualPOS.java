package abstractjava.abstract7;


public interface VirtualPOS {
    float commissionRate = 0.80f;


    static boolean isValidCreditCardNumber(String cardNo) {
        
        System.out.println("Credit Card Number Validation is being checked");
        return (cardNo.length() == 16);

    }

    boolean pay(String creditCardNo, double amount);

    boolean payBack(String creditCardNo, double amount);

    boolean provision(String creditCardNo, double amount);

    default boolean payInInstallment(String creditCardNo, double amount,
                                     int numberOfInstallment) {
        System.out.println("Payment in Installment: " + creditCardNo +
                ":" + amount + ":" + numberOfInstallment);

        System.out.println("Amount Per Installment: " + getOneInstallment(amount, numberOfInstallment));
        return true;
    }

    
    private double getOneInstallment(double amount, int numberOfInstallment) {
        return amount / numberOfInstallment;
    }

}
