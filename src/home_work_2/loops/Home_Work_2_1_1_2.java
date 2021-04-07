package home_work_2.loops;

import home_work_2.utils.ValueFromConsole;

public class Home_Work_2_1_1_2 {
    public static void main(String[] args) {
        long number = ValueFromConsole.longFromConsole();
        System.out.println(recursionCondition(number) + " = " + recursionResult(number));
    }

    /**
     * Функция получает входной параметр типа long и возвращает значение до знака "=" (по условию задачи)
     * @param n входной параметр типа long
     * @return возвращает значение типа string (по условию задачи)
     */
    public static String recursionCondition(long n) {
        if (n == 1) {
            return "1";
        }
        return recursionCondition(n - 1) + " * " + n;
    }

    /**
     * Функция получает входной параметр типа long и возвращает значение полсе знака "=" (по условию задачи)
     * @param n входной параметр типа long
     * @return возвращает значение типа string (по условию задачи)
     */
    public static long recursionResult(long n) {
        if (n == 1) {
            return n;
        }
        return n * recursionResult(n - 1);
    }
}
