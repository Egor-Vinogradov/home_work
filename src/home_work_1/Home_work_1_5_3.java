package home_work_1;

import java.util.Scanner;

public class Home_work_1_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();

        ifResult(name);
    }

    public static void ifResult(String name) {
        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;
        }
    }
}
