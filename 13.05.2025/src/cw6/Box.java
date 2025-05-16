package cw6;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> items = new ArrayList<>();

    public  void add(T item) {
        items.add(item);
    }

    public T get(int name) {
        return items.get(name);
    }

    public int size() {
        return items.size();
    }
}
