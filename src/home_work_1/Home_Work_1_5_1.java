package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Home_Work_1_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.next();

        ifResult(name);
    }

    public static void ifResult(String name) {
        if (Objects.equals(name, "Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else {
            if (Objects.equals(name, "Анастасия")){
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
