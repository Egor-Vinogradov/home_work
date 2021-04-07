package home_work_2.utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Задача 2.1.2
        System.out.println(Arrays.toString(arrayRandom(5, 100)));

        // Задача 2.2.1
        // Элементы по порядку в консоль
        itemsInOrderToTheConsole(arrayFromConsole(scanner.next()));

        // Задача 2.2.2
        // Каждый второй элемент массива в консоль
        secondItemToConsole(arrayFromConsole(scanner.next()));

        // Задача 2.2.3
        // Все элементы массива в консоль в обратном порядке
        reversItemToConsole(arrayFromConsole(scanner.next()));

    }

    /**
     * Задача 2.2.3 Метод выводит принятый массив в обратном порядке
     * @param arrayFromConsole входной параметр: массив типа int
     */
    public static void reversItemToConsole(int[] arrayFromConsole) {
        System.out.println(Arrays.toString(arrayFromConsole));
        int j = arrayFromConsole.length;
        // do....while
        System.out.println("С помощью do....while:");
        do {
            System.out.print(arrayFromConsole[--j] + " ");
        } while (j > 0);
        System.out.println();

        // while
        System.out.println("С помощью while:");
        j = arrayFromConsole.length;
        while (j > 0) {
            System.out.print(arrayFromConsole[j - 1] + " ");
            j--;
        }
        System.out.println();

        // for
        System.out.println("С помощью for:");
        for (int i = arrayFromConsole.length; i > 0; i--) {
            System.out.print(arrayFromConsole[i - 1] + " ");
        }
        System.out.println();

        // foreach
        System.out.println("С помощью foreach:");
        // добавил метод для разворота массива
        for (int arr: returnReversArray(arrayFromConsole)) {
            System.out.print(arr + " ");
        }
    }

    /**
     * Метод разворачивает массив
     * @param arr входной параметр массив типа int
     * @return возвращает развернутый массив
     */
    public static int[] returnReversArray(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    /** Задача 2.2.2 Метод выводит каждый второй элемент массива в консоль
     *
     * @param arrayFromConsole входной параметр: массив типа int
     */
    public static void secondItemToConsole(int[] arrayFromConsole) {
        int j = 1;
        // do....while
        System.out.println("С помощью do....while:");
        do {
            System.out.print(arrayFromConsole[j] + " ");
            j += 2;
        } while (j < arrayFromConsole.length);
        System.out.println();

        // while
        System.out.println("С помощью while:");
        j = 1;
        while (j < arrayFromConsole.length) {
            System.out.print(arrayFromConsole[j] + " ");
            j += 2;
        }
        System.out.println();

        // for
        System.out.println("С помощью for:");
        for (int i = 1; i < arrayFromConsole.length; i += 2) {
            System.out.print(arrayFromConsole[i] + " ");
        }
        System.out.println();

        // foreach
        j = 1;
        System.out.println("С помощью foreach:");
        for (int arr: arrayFromConsole) {
            if (j % 2 == 0) {
                System.out.print(arr + " ");
            }
            j++;
        }
    }

    /** Задача 2.2.1 Метод выводит элементы массива по порядку
     *
     * @param arrayFromConsole входной параметр: массив типа int
     */
    public static void itemsInOrderToTheConsole(int[] arrayFromConsole) {
        int j = 0;
        // do....while
        System.out.println("С помощью do....while:");
        do {
            System.out.print(arrayFromConsole[j++] + " ");
        } while (j < arrayFromConsole.length);
        System.out.println();

        // while
        System.out.println("С помощью while:");
        j = 0;
        while (j < arrayFromConsole.length) {
            System.out.print(arrayFromConsole[j] + " ");
            j++;
        }
        System.out.println();

        // for
        System.out.println("С помощью for:");
        int i;
        for (i = 0; i < arrayFromConsole.length; i++) {
            System.out.print(arrayFromConsole[i] + " ");
        }
        System.out.println();

        // foreach
        System.out.println("С помощью foreach:");
        for (int arr: arrayFromConsole) {
            System.out.print(arr + " ");
        }
    }

    /**
     * Задача 2.1.1 Получение массива через консоль
     * Задаем размер массива и элементы
     * @return возвращает массив
     */
    public static int[] arrayFromConsole(String str) {
        Scanner scaner = new Scanner(str);

        System.out.print("Введите размер массива: ");
        int sizeArray = 0;
        try {
            sizeArray = scaner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректные данные!");
            arrayFromConsole(str);
        }

        int elementArray = 0;
        int [] container = new int[sizeArray];// инициализация массива

        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Введите элемент массива: ");
            try {
                elementArray = scaner.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели некорректные данные!");
                arrayFromConsole(str);
            }
            container[i] = elementArray;
        }
        return container;
    }

    /**
     * Задача 2.1.2 Метод возвращает рандомный массив с входящими параметрами: размер и предел числа
     * @param size входящий параметр - размер массива
     * @param maxValueExclusion входящий параметр - предел генерируемого числа
     * @return возвращает массив
     */
    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int [] container = new int[size];// инициализация массива
        for (int i = 0; i < size; i++) {
            container[i] = (int) (Math.random() * maxValueExclusion);
        }
        return container;
    }

    /**
     * Пузырьковая сортировка
     * @param arr входной параметр массив типа ште
     * @return возвращает отсортированный массив
     */
    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
