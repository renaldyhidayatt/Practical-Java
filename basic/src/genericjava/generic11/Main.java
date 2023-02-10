package genericjava.generic11;

import java.util.List;

public class Main {

    public static void main(String[] args) {
    }

    private <T> void insertHelper(List<T> list) {
        list.set(0, list.get(0));
    }

    void insert(List<?> list) {
        insertHelper(list);
    }
}
