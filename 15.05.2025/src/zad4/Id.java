package zad4;

public class Id<T> {

    private T t;

    public Id(T t) {
        this.t = t;
    }

    public T getId() {
        return t;
    }
}
