package genericjava.generic15;

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

    private static T myT;
}

public class Main {

    public static void main(String[] args) {

        Data<double> data = new Data<double>();
    }

    public void foo(Data<Double> data) {
    }

    public void foo(Data<Integer> data) {
    }

    public static <T> void test(Data<T> data) {
        T t = new T();
        System.out.println(data instanceof Data<String>);

        System.out.println(data instanceof Data);
        System.out.println(data instanceof Data<?>);

        Data<Integer> integerData = new Data<>(5);
        Data<Number> numberData = (Data<Number>) integerData;

        Data<Double> doubleDataA = new Data<>(5.0);
        Data<Double> numberDataB = (Data<Double>) doubleDataA;

        Data<String>[] dataArray = new Data<String>[2];
        Object[] objectArray = new Data<String>[2];

    }

    public static <T extends Exception> void work() {
        try {
        } catch (T exception) {
        }
    }
}

class MyData<T extends Exception> {
    public void test() throws T {

    }

  
class DataException<T> extends Exception{}
