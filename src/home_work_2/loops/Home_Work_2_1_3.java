package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Home_Work_2_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        int power = 0;

        // считываем число
        System.out.print("Введите число: ");
        String value = scanner.next();
        try {
            number = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректные данные!");
            return;
        }

        // считываем степень
        System.out.print("Введите степень: ");
        String valuePower = scanner.next();
        try {
            power = Integer.parseInt(valuePower);
            if (power <= 0) {
                System.out.println("Значение должно быть больше и не равно 0!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректные данные!");
        }

        numberExponentiation(number, power);

        scanner.close();
    }

    public static void numberExponentiation(double a, int b) {
        // https://javarush.ru/groups/posts/2828-kak-vihpolnitjh-vozvedenie-v-stepenjh-v-java
        // 7 вариантов возведения
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        System.out.println(a + " ^ " + b + " = " + (new DecimalFormat("###,###.00").format(result)));
    }
}
