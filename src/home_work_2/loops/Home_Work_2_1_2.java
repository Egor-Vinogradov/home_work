package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Home_Work_2_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            loopsResult(createArrayFromNumber(number));
        } else if (scanner.hasNextDouble() || scanner.hasNextFloat()) {
            // срабатывает на числа через запятную. на точку срабатывает через try catch
            System.out.println("Введено не целое число!");
        } else {
            System.out.println("Введено не число!");
        }

        scanner.close();
    }

    /**
     * Функция переводит введенное число в массив цифр числа
     * @param number
     * @return
     */
    public static int[] createArrayFromNumber(int number) {
        String s = Integer.toString(number);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        return arr;
    }

    public static void loopsResult(int[] arr) {
        int result = 1;
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
