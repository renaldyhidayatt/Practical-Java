package abstractjava.abstract6;

public class KingMarketPlace {
    public static void payByVirtualPOS(VirtualPos virtualPOS,
                                       String creditCardNo,
                                       double amount) {
        virtualPOS.pay(creditCardNo, amount);
    }

    public static void main(String[] args) {
        VirtualPos bankColoradoPOS = new BankColoradoPos();
        
        BankCalifornia bankCaliforniaPOS = new BankCalifornia();

        payByVirtualPOS(bankColoradoPOS, "0000-0001-0002-0003", 100);
        payByVirtualPOS(bankCaliforniaPOS, "9999-9991-9992-9933", 75);

    }
}
