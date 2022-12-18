import behavior_patterns.chainofresponsibility.App_Chain;
import structural_patterns.adapter_patterns.App_adapter;
import structural_patterns.bridge_patterns.App_bridge;
import structural_patterns.composite_patterns.App_composite;
import structural_patterns.decorator_patterns.App_Decorator;
import structural_patterns.flyweight_pattern.Client;
import structural_patterns.proxy_patterns.ProxyPatterns;

public class App {
    public static void main(String[] args) throws Exception {

        App_adapter.kentang();
        System.out.println("------");
        App_bridge.kentang();
        System.out.println("------");
        App_Decorator.kentang();
        System.out.println("------");
        Client.kentang();
        System.out.println("------");
        ProxyPatterns.kentang();
        System.out.println("------");

        App_Chain.kentang();
    }
}
