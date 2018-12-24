public interface Tree<T extends Comparable<T>> {
    void add(T t);
    void remove();
    void print();
}
