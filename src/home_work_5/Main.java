package home_work_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] data1 = {1, 2, 3};
//        Integer[] data1 = {1, null, 3, null, null, null};
        // data = [1, 2, 3, null, null, null]
        // data = [1, null, 3, null, null, null]
        DataContainer<Integer> data = new DataContainer<>(data1);
        data.add(1);
        data.add(9);
        data.add(8);
        System.out.println(data.get(4));
        System.out.println(data.get(5));
        System.out.println(data.get(6));
        System.out.println(data);
    }
}
