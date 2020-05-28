package HW1.part2;

public class main {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<Apple>();
        Box<Apple> appleBox2 = new Box<Apple>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox2.add(new Apple());
        System.out.println("Коробка 1 с 2 яблоками " + appleBox1.getWeight());
        System.out.println("Коробка 2 с 1 яблоком" +appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<Orange>();
        Box<Orange> orangeBox1 = new Box<Orange>();
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());
        System.out.println("Коробка 1 с 0 апельсинами " + orangeBox1.getWeight());
        System.out.println("Коробка 1 с 2 апельсинами " + orangeBox.getWeight());

        appleBox1.moveAllTo(appleBox2);
        System.out.println("Вес 1 коробки после того как перенесли все в 2 коробку " + appleBox1.getWeight());
        System.out.println("Новый вес 2 коробки " + appleBox2.getWeight());

        System.out.println("Сопоставим 1 коробку с яблоками с 1 коробкой апельсинов " + appleBox1.compareTo(orangeBox1));
        System.out.println("Сопоставим 1 коробку с яблоками с коробкой 2 апельсинов " + appleBox1.compareTo(orangeBox));
        System.out.println("Сопоставим 2 коробку с яблоками с коробкой 2 апельсинов " + appleBox2.compareTo(orangeBox));
    }
}
