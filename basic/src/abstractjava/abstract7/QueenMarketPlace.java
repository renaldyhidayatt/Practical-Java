package abstractjava.abstract7;

public class QueenMarketPlace extends ElectronicCommerce implements VirtualPOS, CardlessPayment {
    @Override
    public boolean payByPayPal(String accountNumber, double amount) {
        return false;
    }

    @Override
    public boolean payByPayooner(String accountNumber, double amount) {
        return false;
    }

    @Override
    public boolean pay(String creditCardNo, double amount) {
        return false;
    }

    @Override
    public boolean payBack(String creditCardNo, double amount) {
        return false;
    }

    @Override
    public boolean provision(String creditCardNo, double amount) {
        return false;
    }

}
