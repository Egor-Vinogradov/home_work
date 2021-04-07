package home_work_2.loops;

import home_work_2.utils.ValueFromConsole;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Home_Work_2_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        loopsResult(createArrayFromNumber(ValueFromConsole.longFromConsoleWithVerification(scanner.next())));
    }

    /**
     * Функция переводит введенное число в массив цифр переданного числа
     * @param number входной параметр типа long
     * @return возвращает массив типа long
     */
    public static long[] createArrayFromNumber(long number) {
        String s = Long.toString(number);
        long[] arr = new long[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    /**
     * Функция получает массив типа long и выводит заданный задачей результат в указанном формате ###,###
     * @param arr входной массив типа long
     */
    public static void loopsResult(long[] arr) {
        long result = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i != (arr.length - 1)) {
                System.out.print(arr[i] + " * ");
            } else {
                System.out.print(arr[i]);
            }
            result = result * arr[i];
        }
        System.out.println(" = " + (new DecimalFormat("###,###").format(result)));
    }

}
