package home_work_2.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Home_Work_2_1_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите целое число: ");
            long number = scanner.nextLong();
            loopsResult(number);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели некорректные данные!");
        }
        scanner.close();
    }

    public static void loopsResult(long n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
            result = result * i;
        }
        System.out.print(result);
    }
}
