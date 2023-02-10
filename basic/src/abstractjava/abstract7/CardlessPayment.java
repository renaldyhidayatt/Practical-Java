package abstractjava.abstract7;

public interface CardlessPayment {
    
    boolean payByPayPal(String accountNumber, double amount);

    boolean payByPayooner(String accountNumber, double amount);
}
