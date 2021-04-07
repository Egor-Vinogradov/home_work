package home_work_2.utils;

import java.util.Scanner;

public class ValueFromConsole {
    public static void main(String[] args) {
//        System.out.println(longFromConsole());
//        System.out.println(longFromConsoleWithVerification());
    }

    /**
     * Функция получает значение из консоли, проверяет и возвращает полученное значение типа long
     * @return возвращает значение типа long. В случае не выполнения условия возвращает 0
     */
    public static long longFromConsole(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        long result = 0;
        try {
            result = Long.parseLong(string);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректные данные!");
        }
        scanner.close();
        return result;
    }

    /**
     * Функция получает значение из консоли, проверяет и возвращает полученное значение типа long
     * Делает дополнительную проверку на целостность значения
     * @return возвращает значение типа long. В случае не выполнения условия возвращает 0
     */
    public static long longFromConsoleWithVerification() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        String stringReplace = string.replace('.', ',');
        long result = 0;

        Scanner scanner1 = new Scanner(stringReplace);
        if (scanner1.hasNextLong()) {
            return Long.parseLong(stringReplace);
        } else if (scanner1.hasNextDouble() || scanner1.hasNextFloat()){
            System.out.println("Введено не целое число " + stringReplace);
        } else {
            System.out.println("Введено не число!");
        }
        scanner1.close();

        return result;
    }

    /**
     * Функция получает значение из консоли, проверяет и возвращает полученное значение типа long
     * Делает дополнительную проверку. Значение должно быть целое и положительное
     * @return возвращает значение типа long. В случае не выполнения условия возвращает 0
     */
    public static long longFromConsoleWithVerificationPositive() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        String stringReplace = string.replace('.', ',');
        long result = 0;

        Scanner scanner1 = new Scanner(stringReplace);
        if (scanner1.hasNextLong()) {
            if (Long.parseLong(stringReplace) > 0) {
                return Long.parseLong(stringReplace);
            } else {
                System.out.println("Значение должно быть больше и не равно 0!");
            }
        } else if (scanner1.hasNextDouble() || scanner1.hasNextFloat()){
            System.out.println("Введено не целое число " + stringReplace);
        } else {
            System.out.println("Введено не число!");
        }
        scanner1.close();

        return result;
    }

    /**
     * Функция получает значение из консоли, проверяет и возвращает полученное значение типа double
     * @return возвращает значение типа long. В случае не выполнения условия возвращает 0
     */
    public static double doubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        double result = 0;
        try {
            result = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некорректные данные!");
        }
        scanner.close();
        return result;
    }
}
