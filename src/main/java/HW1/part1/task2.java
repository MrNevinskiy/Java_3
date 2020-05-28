package HW1.part1;

import java.util.ArrayList;
import java.util.List;

public class task2 {

    public static <T> List <T> toArrayList(T[] array){
        List<T> list = new ArrayList<>();
        for (T value : array){
            list.add(value);
        }
        return list;
    }

    public static void main(String[] args) {
        String [] strings = {"a", "b", "c"};
        List<String> stringList = toArrayList(strings);
        System.out.println(stringList);
    }
}
