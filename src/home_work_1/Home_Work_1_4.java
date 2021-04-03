package home_work_1;

import java.util.Scanner;

public class Home_Work_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("У Вас рабочий день? (true, false): ");
        Boolean weekday = scanner.nextBoolean();
        System.out.print("У Вас отпуск? (true, false)");
        Boolean vacation = scanner.nextBoolean();

        if (weekday == true & vacation == true){
            System.out.println("Такого варианта не бывает!!!)))");
        } else {
            if (sleepIn(weekday, vacation)) {
                System.out.println("Можно спать дальше!");
            }else{
                System.out.println("Нужно идти на работу!");
            }
        }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

//        sleepIn(false, false) → true
//        sleepIn(true, false) → false
//        sleepIn(false, true) → true
        if (weekday == false & vacation == false) {
            return true;
        } else if (weekday == true & vacation == false) {
            return false;
        } else if (weekday == false & vacation == true) {
            return true;
        }
        return false;
    }
}
