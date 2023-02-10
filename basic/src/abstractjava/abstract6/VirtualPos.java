package abstractjava.abstract6;

public interface VirtualPos {
    boolean pay(String creditCardNo, double amount);

    boolean payBack(String creditCardNo, double amount);

    boolean provision(String creditCardNo, double amount);
}
