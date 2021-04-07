package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.ValueFromConsole;

import java.util.Scanner;

public class OutputRezult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = ValueFromConsole.intFromConsole(scanner.next());

        System.out.print("Введите предел числа: ");
        int maxValueExclusion = ValueFromConsole.intFromConsole(scanner.next());

        int[] arr = ArraysUtils.arrayRandom(size, maxValueExclusion);

        System.out.println("С помощью do....while:");
        IArraysOperation doWhileOperation = new DoWhileOperation();
        doWhileOperation.itemsInOrderToTheConsole(arr);
        doWhileOperation.secondItemToConsole(arr);
        doWhileOperation.reversItemToConsole(arr);
        System.out.println("______________________");

        System.out.println();

        System.out.println("С помощью while:");
        IArraysOperation whileOperation = new WhileOperation();
        whileOperation.itemsInOrderToTheConsole(arr);
        whileOperation.secondItemToConsole(arr);
        whileOperation.reversItemToConsole(arr);
        System.out.println("______________________");

        System.out.println();

        System.out.println("С помощью for:");
        IArraysOperation forOperation = new ForOperation();
        forOperation.itemsInOrderToTheConsole(arr);
        forOperation.secondItemToConsole(arr);
        forOperation.reversItemToConsole(arr);
        System.out.println("______________________");

        System.out.println();

        System.out.println("С помощью foreach:");
        IArraysOperation forEachOperation = new ForEachOperation();
        forEachOperation.itemsInOrderToTheConsole(arr);
        forEachOperation.secondItemToConsole(arr);
        forEachOperation.reversItemToConsole(arr);


    }
}
