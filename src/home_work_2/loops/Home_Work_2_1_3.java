package home_work_2.loops;

import home_work_2.utils.ValueFromConsole;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Home_Work_2_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number;
        long power;

        // считываем число
        System.out.print("Введите число: ");
        number = ValueFromConsole.doubleFromConsole(scanner.next());

        // считываем степень
        System.out.print("Введите степень: ");
        long powerConsole = ValueFromConsole.longFromConsoleWithVerificationPositive(scanner.next());
        if (powerConsole != 0) {
            power = powerConsole;
        } else {
            return;
        }

        numberExponentiation(number, power);
    }

    /**
     * Функция возводит в степень и выводит результат в формате по условию задача
     * @param a входной параметр возводимого числа. Тип double, может быть отрицательное
     * @param b входной параметр степени. Тип long, может быть только целое и положительное
     */
    public static void numberExponentiation(double a, long b) {
        // https://javarush.ru/groups/posts/2828-kak-vihpolnitjh-vozvedenie-v-stepenjh-v-java
        // 7 вариантов возведения
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println(a + " ^ " + b + " = " + (new DecimalFormat("###,###.00").format(result)));
    }
}
