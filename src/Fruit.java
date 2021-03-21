public class Fruit {
    private boolean fresh = true;

    public final boolean getFresh() {
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fresh=" + fresh + '}';
    }
}
