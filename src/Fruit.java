public class Fruit {
    private boolean fresh = true;

    public final boolean getFresh() {
        System.out.println("Проверил на свежесть" + fresh);
        return fresh;
    }

    public final void setFresh(final boolean fresh) {
        System.out.println("Изменил свежесть на " + fresh);
        this.fresh = fresh;
    }
}
