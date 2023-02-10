package abstractjava.abstract7;

public class KingMarketPlace {
    public static void payByVirtualPOS(VirtualPOS virtualPOS,
                                       String creditCardNo,
                                       double amount) {
        virtualPOS.pay(creditCardNo, amount);
    }

    public static void main(String[] args) {
        VirtualPOS bankColoradoPOS = new BankColoradoPOS();
        BankCaliforniaPOS bankCaliforniaPOS = new BankCaliforniaPOS();

        payByVirtualPOS(bankColoradoPOS, "0000-0001-0002-0003", 100);
        payByVirtualPOS(bankCaliforniaPOS, "9999-9991-9992-9933", 75);

    }
}
