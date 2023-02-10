package polymorphism.polymorphism7;

import java.util.Objects;

public class Bitcoin extends Payment {

    
    public float oneBitcoin = 2.5f;
    
    public int maxDiscountRatio = 3;

    
    public static String getAccountNumber() {
        return "Bitcoin Account:00000123";
    }

    
    public float exchangeBitcoin(int amount) {
        return amount * oneBitcoin;
    }

    @Override
    public void pay() {
        System.out.println("Bitcoin class: Payment by Bitcoin completed");
    }

    
    public void printInstallment(int totalAmount) {
        System.out.println("Bitcoin class: Installment amount in Integer: " + totalAmount / 5);
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "oneBitcoin=" + oneBitcoin +
                ", maxDiscountRatio=" + maxDiscountRatio +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneBitcoin, maxDiscountRatio);
    }


}
