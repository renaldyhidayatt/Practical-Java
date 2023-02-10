package genericjava.generic2;

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
        
        Data<Integer> dataA = new Data<>();
        
        dataA.setElement(100);
        Integer myInt = dataA.getElement();
        System.out.println(myInt);
    }
}
