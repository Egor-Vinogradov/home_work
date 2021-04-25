package home_work_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringsNumeral stringsNumeral = new StringsNumeral();

        // задание 1
//        System.out.println(stringsNumeral.toString(inputTaskOne()));

        // задание 2
//        System.out.println(stringsNumeral.toString(inputTaskTwo()));

        // задание 3
//        System.out.println(stringsNumeral.toWeek(inputTaskThree()));

        // задание 4
//        System.out.println(stringsNumeral.toHoursMinuteSecondMillisecond(inputTaskFour(), inputTaskFour(true)));
        System.out.println(stringsNumeral.toHoursMinuteSecondMillisecond(7789001, true));
        System.out.println(stringsNumeral.toHoursMinuteSecondMillisecond(7789001, false));
    }

    public static int inputTaskOne() {
        int rezult = 0;
        System.out.print("Введите число в диапазоне от - 999 999 999 до 999 999 999: ");
        try {
            rezult = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение.");
        }
        return rezult;
    }

    public static double inputTaskTwo() {
        double rezultNew = 0;
        System.out.print("Введите число в диапазоне от - 999 999 999 до 999 999 999: ");
        try {
            String rezult = new Scanner(System.in).nextLine();
            // проверяем на наличие запятой. Если есть, то меняем на точку
            rezultNew = Double.parseDouble(rezult.replace(',', '.'));
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение.");
        }
        return rezultNew;
    }

    public static int inputTaskThree() {
        int rezult = 0;
        System.out.print("Введите количество дней (максимальное значение 999 999 999): ");
        try {
            rezult = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение.");
        }
        return rezult;
    }

    public static int inputTaskFour() {
        int rezult = 0;
        System.out.print("Введите количество милисекунд (максимальное значение 999 999 999): ");
        try {
            rezult = new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение.");
        }
        return rezult;
    }

    public static boolean inputTaskFour(boolean shortFormat) {
        boolean rezult = true;

        System.out.print("Введите формат времени (1, либо 2): ");

        try {
            int number = new Scanner(System.in).nextInt();
            switch (number) {
                case 1:
                    return true;
                case 2:
                    return false;
                default:
                    System.out.println("Вы ввели некорректное значение.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение.");
        }
        return rezult;
    }
}
