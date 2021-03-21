public class BoxUtil {

    // скопировать содержимое из одной коробки в другую
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T> void copyFromBoxToBox(final Box<T> src, final Box<? super T> dest) {
        dest.putElement(src.getElement());
    }

    // скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
    // при условии, что содержащийся фрукт свежий (fresh == true).
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T> void copyFreshFruitFromBoxToBox(final Box<? extends Fruit> src, final Box<? super Fruit> dest) {
        if (src.getElement().getFresh()) {
            dest.putElement(src.getElement());
        }
    }


    //   вывести в консоль (toString()) объект второй коробки
    public static <T extends Box<T>> void printElementFromTwoBoxes(final Box<T> box) {
        if (box != null) {
            T box1 = box.getElement();
            if (box1 != null) {
                System.out.println(box1.getElement());
            } else {
                System.out.println("Во второй коробке пусто!");
            }
        } else {
            System.out.println("Не передавай пустоту!");
        }
    }


    /**
     * вывести в консоль (toString()) объект последней коробки
     * <p>
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     *
     * @param <T> is T
     * @param box is box
     */

    public static <T> void printElementFromBoxes(final Box<T> box) {
        Object element = box;
        if (element != null) {
            while (element instanceof Box && ((Box<?>) element).getElement() != null) {
                element = ((Box<?>) element).getElement();
            }
            if (element instanceof Box) {
                System.out.println("В последней коробке пусто!");
            } else {
                System.out.println("Последний элемент " + element);
            }
        } else {
            System.out.println("Не передавай пустоту!");
        }
    }
}


