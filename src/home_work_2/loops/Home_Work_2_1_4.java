package home_work_2.loops;

import home_work_2.utils.ValueFromConsole;

import java.util.Scanner;

import static java.lang.Math.multiplyExact;

public class Home_Work_2_1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = 1;
        long b;

        System.out.print("Введите целое число: ");
        b = ValueFromConsole.longFromConsole(scanner.next());

        multiplicationValue(a, b);
    }

    /**
     * Функция умножает число long = 1 на введенное число до переполнения. Выводит результат до и после переполнения
     * @param a входной параметр типа long
     * @param b входной параметр типа long
     */
    private static void multiplicationValue(long a, long b) {
        long result = 1;
        try {
            for (int i = 0;; i++) {
                result = multiplyExact(a, b);
                a *= b;
            }
        } catch (ArithmeticException e) {
            System.out.println("Значение до переполнения: " + result);
        }
        result *= b;
        System.out.println("Значение после переполнения: " + result);
    }

}
