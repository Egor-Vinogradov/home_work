package home_work_3_dop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // переменная для режима игры
        int mode = 0;

        // переменная для количества колец
        int numberOfRings = 0;

        /**
         * Инициализируем объект для ввода значений
         */
        InputValue value = new InputValue();

        /**
         * Получаем от пользователя режим игры (ручной либо автоматический).
         * Проверяем на корректность ввода данных
         */
        while (mode == 0) {
            mode = value.inputMode();
        }
        System.out.println("Режим игры: " + mode);

        /**
         * Получаем от пользователя количество колец
         * Проверяем на корректность ввода данных
         */
        while (numberOfRings == 0) {
            numberOfRings = value.inputNumberOfRings();
        }

        HanoyTowers hanoyTowers = new HanoyTowers(numberOfRings);

//        Arrays.stream(hanoyTowers.getArr()).map(Arrays::toString).forEach(System.out::println);

        // делаем ход
        int[] arr = {0, 0};
        int[] arrCheck = {0, 0};
        while (Arrays.equals(arr, arrCheck)) {
            arr = value.inputMove();
        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}
