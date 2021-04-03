package home_work_1;

public class Home_Work_1_2 {

    public static void main(String[] args) {
        // 5 + 2 / 8
        result1();

        // (5 + 2) / 8
        result2();

        // (5 + 2++) / 8
        result3();

        // (5 + 2++) / --8
        result4();

        // (5 * 2 >> 2++) / --8
        result5();

        // (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        result6();

        // (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        result7();

        // 6 - 2 > 3 && 12 * 12 <= 119
        result8();

        // true && false
        result9();

    }

    private static void result9() {
        // true && false
        boolean result = true && false;
        System.out.println(result);
        /*
        true && false = false
        */
    }

    private static void result8() {
        // 6 - 2 > 3 && 12 * 12 <= 119
        boolean result = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(result);
        /*
        1. 6 - 2 = 4
        2. 12 * 12 = 144
        3. 4 > 3 = true
        4. 144 <= 119 = false
        5. true && false = false
        */
    }

    private static void result7() {
        // (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
        int a = 8;
        int b = 2;
//        int result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --a;
//        System.out.println(result);
        // выдает ошибку, т.к. проверка 68 >= 68 в данном примере не логична. она не имеет продолжения
        // но это не точно
    }

    private static void result6() {
        // (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        int a = 8;
        int b = 2;
        int result6 = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a;
        System.out.println(result6);
        /* но это не точно)))
        1. 5 + 7 = 13
        2. 22 * 2 = 44
        2.1 2 + 1 = 3
        3. 44 >> 2 = 11
        4. тернарный оператор: т.к. 13 не больше 20, тогда выполняется 11 (44>>2)
        5. 8 - 1 = 7
        6. 11 / 7 = 1,571428571428571 - для int это 1
        */
    }

    private static void result5() {
        // (5 * 2 >> 2++) / --8
        int a = 8;
        int b = 2;
        int result5 = (5 * 2 >> b++) / --a;
        System.out.println(result5);
        /*
        1. 5 * 2 = 10
        2. 10 >> 2 = 2
        2.1 2 + 1 = 3
        3. 8 - 1 = 7
        4. 2 / 7 = 0,2857142857142857 - для int это 0
        */
    }

    private static void result4() {
        // (5 + 2++) / --8
        int a = 8;
        int b = 2;
        int result4 = (5 + b++) / --a;
        System.out.println(result4);
        System.out.println(a);
        System.out.println(b);
        /*
        1. (5 + 2) = 7
        1.1 2 + 1 = 3
        2. 8 - 1 = 7
        3. 7 / 7 = 1
        */
    }

    private static void result3() {
        // (5 + 2++) / 8
        int a = 8;
        int b = 2;
        int result3 = (5 + b++) / 8;
        System.out.println(result3);
        System.out.println(b);
        /*
        1. (5 + 2) = 7
        1.1 2 + 1 = 3
        2. 7 / 8 = 0.875
        */
    }

    private static void result2() {
        // (5 + 2) / 8
        int result2 = (5 + 2) / 8;
        System.out.println(result2);
        /*
        1. (5 + 2) = 7
        2. 7 / 8 = 0,875 - для int это 0
        */
    }

    private static void result1() {
        // 5 + 2 / 8
        int result1 = 5 + 2 / 8;
        System.out.println(result1);
        /*
        1. 2/8
        2. 5 + 1/4 = 5.25 - для int это 5
        */
    }
}
