package enumjava.enum2;


public class TestPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setSelectedPaper(Paper.A4);
        printer.print("Message");
    }
}
