package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        /*
        4.1 + 15 * 7 + (28 / 5) ^ 2
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int g = 2;

        double rezult = a + b * c + Math.pow((d / e), g);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);

    }
}
