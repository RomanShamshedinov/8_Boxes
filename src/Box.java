public class Box<T> {
    private T element;

    public final T getElement() {
        return element;
    }

    public final void putElement(final T elemente) {
        this.element = elemente;
    }

    @Override
    public final String toString() {
        return "Box{" + "element=" + element + '}';
    }
}
