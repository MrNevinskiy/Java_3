package HW1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<E extends Fruit> {

    private List<E> fruits = new ArrayList<>();

    public Box(E... fruits){
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public void add(E fruit){
        fruits.add(fruit);
    }

    public void moveAllTo(Box<E> anotherBox){
        for(E fruit: fruits){
            anotherBox.add(fruit);
        }
        fruits.clear();
    }

    public float getWeight(){
        float sum = 0.0f;
        for (E fruit : fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compareTo(Box<?> anotherBox){
        return Math.abs(this.getWeight() - anotherBox.getWeight()) <= 0.0f;
    }
}
