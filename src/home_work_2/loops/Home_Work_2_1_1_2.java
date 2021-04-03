package home_work_2.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Home_Work_2_1_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            long number = scanner.nextLong();
            System.out.println(recursionCondition(number) + " = " + recursionResult(number));
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели некорректные данные!");
        }

        scanner.close();
    }

    public static String recursionCondition(long n) {
        if (n == 1) {
            return "1";
        }
        return recursionCondition(n - 1) + " * " + n;
    }

    public static long recursionResult(long n) {
        if (n == 1) {
            return n;
        }
        return n * recursionResult(n - 1);
    }
}
