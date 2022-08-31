package design_patterns.factory;

public class App {
    public static void dota(){
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();

        Computer computer2 = computerFactory.getComputer("Phone");
        computer2.compute();


        Computer computer3 = computerFactory.getComputer("SmartTv");
        computer3.compute();
    }
}
