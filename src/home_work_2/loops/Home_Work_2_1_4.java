package home_work_2.loops;

import java.util.Scanner;

import static java.lang.Math.multiplyExact;

public class Home_Work_2_1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String number = scanner.next();
        long a = 1;
        int b = 0;

        try {
            b = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректные данные!");
        }

        multiplicationValue(a, b);

        scanner.close();
    }

    private static void multiplicationValue(long a, int b) {
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
