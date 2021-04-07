package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.ValueFromConsole;

import java.util.Arrays;
import java.util.Scanner;

public class Home_Work_2_2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = ValueFromConsole.intFromConsole(scanner.next());

        System.out.print("Введите предел числа: ");
        int maxValueExclusion = ValueFromConsole.intFromConsole(scanner.next());

        int[] array = ArraysUtils.arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(array));

        // Задача 2.4.1 - Сумма четных положительных элементов массива
        sumEvenPositiveNumbers(array);

        // Задача 2.4.2 - Максимальный из элементов массива с четными индексами
        maxEvenIndex(array);

        // Задача 2.4.3 - Элементы массива, которые меньше среднего арифметического
        lessArithmeticMean(array);

        // Задача 2.4.4 - Найти два наименьших (минимальных) элемента массива
        int[] arrNew = array;
        minArrayElement(arrNew);
        // !!!!!!!! дальше во всех методах будет срабатывать сортировка !!!!!!!!!!!!!!!

        // Задача 2.4.5 - Сжать массив, удалив элементы, принадлежащие интервалу
        System.out.print("Введите нижнюю границу удаляемого интервала: ");
        int loverValue = ValueFromConsole.intFromConsole(scanner.next());
        System.out.print("Введите верхнюю границу удаляемого интервала: ");
        int upperValue = ValueFromConsole.intFromConsole(scanner.next());
        compressedArray(array, loverValue, upperValue);

    }

    private static void compressedArray(int[] arr, int a, int b) {
        int i = 0;
        int m = arr.length;
        // перебераем элементы, если находим значение в интервале, уменьшаем размерность на 1
        while (i < m) {
            if (arr[i] <= b && arr[i] >= a) {
                m -= 1;
                for (int j = i; j < m; j++){
                    arr[j] = arr[j + 1];
                }
            } else
                i += 1;
        }
        // вставляем 0 вместо освободившегося элемента
        for (i = m; i < arr.length; i++) {
            arr[i] = 0;
        }
        // выводим оставшиеся элементы не равные 0
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            } else {
                continue;
            }
        }
        System.out.println();
    }

    private static void minArrayElement(int[] arr) {
        // используем сортировку и выводим 2 первых элемента
        int[] sortArr = ArraysUtils.sortArray(arr);
        for (int i = 0; i < 2; i++) {
            System.out.print(sortArr[i] + " ");
        }
        System.out.println();
    }

    private static void lessArithmeticMean(int[] arr) {
        int sum = 0;
        // считаем сумму всех элементов
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // находим среднее
        int avrg = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avrg) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    private static void maxEvenIndex(int[] arr) {
        int max = 0;
        for (int i = 2; i < arr.length; i+=2)
            if (arr[i] > arr[max]) {
                max = i;
            }
        System.out.println(arr[max]);;
    }

    private static void sumEvenPositiveNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
