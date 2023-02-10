package abstractjava.abstract6;

public class BankColoradoPos implements VirtualPos {
    @Override
    public boolean pay(String creditCardNo, double amount) {
        System.out.println("Colorado Bank Virtual POS Payment: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean payBack(String creditCardNo, double amount) {
        System.out.println("Colorado Bank Virtual POS Payment Back: " + creditCardNo +
                ":" + amount);
        return true;
    }

    @Override
    public boolean provision(String creditCardNo, double amount) {
        System.out.println("Colorado Bank Virtual POS Provision: " + creditCardNo +
                ":" + amount);
        return true;
    }
}
