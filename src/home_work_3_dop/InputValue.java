package home_work_3_dop;

import java.util.Scanner;

public class InputValue {
    public InputValue() {

    }

    /**
     * Функция ввода режима игры с проверкой
     * @return возвращает режим игры 1 либо 2. Возвращает 0, если не прошло проверку
     */
    public int inputMode() {
        int mode;
        System.out.print("Выберите режим игры(1 - ручной, 2 - автоматический): ");
        try {
            mode = new Scanner(System.in).nextInt();
            if (mode == 1 || mode == 2) {
                return mode;
            } else {
                System.out.println("Вы ввели неверное значение!");
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не число!");
            return 0;
        }

        return 0;
    }

    /**
     * Функция ввода количества колец с проверкой
     * @return возвращает количество колец от 3 до 8. Возвращает 0, если не прошло проверку
     */
    public int inputNumberOfRings() {
        int numberOfRings;
        System.out.print("Укажите количество колец(минимальное - 3, максимальное - 8): ");
        try {
            numberOfRings = new Scanner(System.in).nextInt();
            if (numberOfRings >= 3 && numberOfRings <= 8) {
                return numberOfRings;
            } else {
                System.out.println("Вы ввели неверное значение!");
            }
        } catch (Exception e) {
            System.out.println("Вы ввели не число!");
            return 0;
        }
        return 0;
    }

    /**
     * Функция ручного ввода шага игры с проверкой. Возвращает пустой массив, если не верно
     * Позволяет выйти из программы, если введен 0
     * @return возвращает массив значений (из 1-3 возвращает [1, 3]).
     */
    public int[] inputMove() {
        int[] arr = new int[2];
        int[] arrCheck = {0,0};
        String str;
        System.out.print("Введите номера стержней через \"-\"(1-3), либо введите 0, для выхода из игры: ");

        str = new Scanner(System.in).next();
        String[] subStr = str.split("-", 2);

        if (str.contains("-") || str.indexOf("-") == 1) {
            for (int i = 0; i < subStr.length; i++) {
                if (checkReturnInt(subStr[i]) == 0) {
                    System.out.println("Вы ввели неверное значение!");
                    return arrCheck;
                }  else {
                    arr[i] = checkReturnInt(subStr[i]);
                }
            }
        } else if (Integer.parseInt(str) == 0) {
            System.out.println("Всего хорошего!!!");
            System.exit(0);
        } else {
            System.out.println("Вы ввели неверное значение!!!");
            return arrCheck;
        }
        return arr;
    }

    /**
     * Функция парсит строку в int. Возвращает 0, если невозможно
     * Проверяет на интервал от 1 до 3
     * @param string входной параметр типа String
     * @return возвращает число типа int, либо 0, если невозможно
     */
    private int checkReturnInt(String string) {
        int number;
        try {
            number = Integer.parseInt(string);
            return checkInterval(number, 1, 3);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /**
     * Функция проверяет число на нахождение в интервале.
     * @param number проверяемое число
     * @param from начало интервала
     * @param to конец интервала
     * @return возвращает число, если находиться в интервале, либо возвращает 0
     */
    private int checkInterval(int number, int from, int to) {
        if (number >= from && number <= to) {
            return number;
        }
        return 0;
    }
}
