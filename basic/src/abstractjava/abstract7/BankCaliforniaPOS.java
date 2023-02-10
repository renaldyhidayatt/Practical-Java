package abstractjava.abstract7;


public class BankCaliforniaPOS implements VirtualPOS {

    @Override
    public boolean pay(String creditCardNo, double amount) {
        System.out.println("California Bank Virtual POS Payment: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean payBack(String creditCardNo, double amount) {
        System.out.println("California Bank Virtual POS Payment Back: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean provision(String creditCardNo, double amount) {
        System.out.println("California Bank Virtual POS Provision: " + creditCardNo +
                ":" + amount);

        return true;
    }

}
