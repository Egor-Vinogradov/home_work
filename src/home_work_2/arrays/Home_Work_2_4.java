package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;
import home_work_2.utils.ValueFromConsole;

import java.util.Arrays;
import java.util.Scanner;

public class Home_Work_2_4 {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,1,1,1};
        int[] array3 = {9,1,5,99,9,9};
        int[] array4 = {};

        System.out.println("[Какой массив был до сортировки] -> [Каким стал массив после сортировки]");
        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(array1) + " -> " + Arrays.toString(SortsUtils.sortArray(array1)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(array1) + " -> " + Arrays.toString(SortsUtils.cocktailSort(array1)));

        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(array2) + " -> " + Arrays.toString(SortsUtils.sortArray(array2)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(array2) + " -> " + Arrays.toString(SortsUtils.cocktailSort(array2)));

        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(array3) + " -> " + Arrays.toString(SortsUtils.sortArray(array3)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(array3) + " -> " + Arrays.toString(SortsUtils.cocktailSort(array3)));

        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(array4) + " -> " + Arrays.toString(SortsUtils.sortArray(array4)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(array4) + " -> " + Arrays.toString(SortsUtils.cocktailSort(array4)));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = ValueFromConsole.intFromConsole(scanner.next());
        System.out.print("Введите предел числа: ");
        int maxValueExclusion = ValueFromConsole.intFromConsole(scanner.next());
        int[] arrayRandom = ArraysUtils.arrayRandom(size, maxValueExclusion);

        // ввод через arrayRandom
        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(arrayRandom) + " -> "
                + Arrays.toString(SortsUtils.sortArray(arrayRandom)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(arrayRandom) + " -> "
                + Arrays.toString(SortsUtils.cocktailSort(arrayRandom)));

        // ввод через arrayFromConsole
        int[] arrayFromConsole = ArraysUtils.arrayFromConsole();
        System.out.println("Пузырьковая сортировка");
        System.out.println(Arrays.toString(arrayFromConsole) + " -> "
                + Arrays.toString(SortsUtils.sortArray(arrayFromConsole)));
        System.out.println("Шейкерная сортировка");
        System.out.println(Arrays.toString(arrayFromConsole) + " -> "
                + Arrays.toString(SortsUtils.cocktailSort(arrayFromConsole)));
    }
}
