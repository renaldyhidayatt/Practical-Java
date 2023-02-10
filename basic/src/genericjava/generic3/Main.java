package genericjava.generic3;

class Data<T> {

    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

public class Main {

    public static void main(String[] args) {

        Data<Double> parameterized = new Data<>();
        parameterized.setElement(100.0);

        
        Data raw = new Data();
        raw.setElement("100");

        raw = parameterized;


        parameterized = raw;
        parameterized.getElement();

    }
}
