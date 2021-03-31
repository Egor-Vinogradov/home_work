package home_work_1;

import java.util.Scanner;

public class Home_work_1_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        byte a = scanner.nextByte();
//        byte a = 42;
        System.out.println(toBinaryString(a));
    }

    public static String toBinaryString(byte number) {

        // я так и не понял, где нужна проверка на положительное входное число, если испльзуется этот метод
        String result = String.format("%8s",
                Integer.toBinaryString(0xFF & number)).replaceAll(" ", "0");

        return result;
    }
}
