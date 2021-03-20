public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>();
        Box<Box> Box1 = new Box<>();
        Box<Box> Box2 = new Box<>();
        Box<Box> Box3 = new Box<>();
        Box<Box> Box4 = new Box<>();
        appleBox.putElement(apple);
        Box1.putElement(appleBox);
        Box2.putElement(Box1);
        Box3.putElement(Box2);
        Box4.putElement(Box3);
        System.out.println("-----------");

        BoxUtil.printElementFromBoxes(Box4);

//        System.out.println("Проверка");
//        System.out.println(Box4.getElement().getElement());
    }
}
