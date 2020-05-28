package HW1.part1;

public class task1 {

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3};
        info(intArray);
        swap(intArray, 0, 2);
        info(intArray);

        String[] strings = {"a","b","c"};
        info(strings);
        swap(strings, 0,2);
        info(strings);
    }

    private static <T> void swap (T[] array, int index1, int index2){
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void info(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n"+"___________________"+"\n");
    }

}
