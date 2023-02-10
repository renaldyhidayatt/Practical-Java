package genericjava.generic4;

interface DataPair<K, V> {
    public K getKey();

    public V getValue();
}


class Data<K, V> implements DataPair<K, V> {
    private K key;
    private V value;



    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

}

public class Main {

    public static void main(String[] args) {
        Data<Integer, String> financeDepartment = new Data<>(100, "Finance " +
                "Department");
        Integer depaprtmentCode = financeDepartment.getKey();
        String departmentName = financeDepartment.getValue();
        System.out.println(depaprtmentCode);
        System.out.println(departmentName);

        // financeDepartment = new Data<>("100", "Finance Department");
    }
}
