package genericjava.generic8;

class Data<K> {
    void print(K k) {
        System.out.println(k.getClass().getName());
    }
}

class MyData<K> extends Data<K> {
    @Override
    void print(K k) {
        super.print(k);
    }
}

public class Main {

    public static void dataTest(Data<Number> data) {
        data.print(100);
    }

    public static void main(String[] args) {

        Data<Number> dataNumber = new Data<>();
        Data<Integer> dataInteger = new Data<>();

        dataTest(dataNumber);

        MyData<Number> myDataNumber = new MyData<>();

        dataTest(myDataNumber);
    }
}
