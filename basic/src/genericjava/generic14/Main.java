package genericjava.generic14;

class Data<T> {
    private T value;


    public Data(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class MyData extends Data<Integer> {

    public MyData(Integer value) {
        super(value);
    }

    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }

}
public class Main {

    public static void main(String[] args) {
    }
}
