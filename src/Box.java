public class Box<T> {
    private T element;

    public final T getElement() {
//        System.out.println("Взял " + element);
        return element;
    }

    public final void putElement(final T elemente) {
//        System.out.println("Положил " + element);
        this.element = elemente;
    }
}
