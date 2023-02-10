package abstractjava.abstract3;

public class TestAbstractMethod {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan("A12345", 100_000, 5);
        
        if (homeLoan.checkCreditHistory()) {
            if (homeLoan.apply()) {
                homeLoan.pay();
            }
        }
    }
}
