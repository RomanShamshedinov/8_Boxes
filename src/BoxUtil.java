public class BoxUtil {

    // скопировать содержимое из одной коробки в другую
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.putElement(src.getElement());
        System.out.println("Скопировал");
    }

    // скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
    // при условии, что содержащийся фрукт свежий (fresh == true).
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T> void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.getElement().getFresh()) {
            dest.putElement(src.getElement());
        }
    }


    //вывести в консоль (toString()) объект второй коробки
    public static <S extends Box<T>, T> void printElementFromTwoBoxes(final Box<S> box) {
        Box<T> box1 = box.getElement();
        System.out.println(box1.getElement());
    }

    /**
     * вывести в консоль (toString()) объект последней коробки
     * <p>
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     *
     * @param <T> is T
     * @param <S> is S
     * @param box is box
     */

    public static <T extends Box<T>, S extends Fruit> void printElementFromBoxes(final Box<T> box) {
        Box<T> boxT = new Box<>();
        boolean qwerty = true;
        while (qwerty) {
            try {
                boxT = box.getElement();
                box.putElement(boxT.getElement());
            } catch (ClassCastException e) {
                System.out.println("Последний элемент это " + boxT.getElement());
                qwerty = false;
            } catch (NullPointerException e) {
                System.out.println("Коробка пуста!");
                qwerty = false;
            }
        }
    }
}


