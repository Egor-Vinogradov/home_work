package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.additional.CalculatorWithMemory2;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        /*
        4.1 + 15 * 7 + (28 / 5) ^ 2
         */
        versionOne();
        versionTwo();

    }

    public static void versionOne() {
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int g = 2;

        // для примера был взят CalculatorWithOperator
        // если создать тип через интерфейс, тогда нужно добавлять команду для рассчета операций в интерфейс
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithOperator());

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);

        // запись в память последней операции
        calc.setMemoryLastOperation();
        // получение значения из памяти
        System.out.println("Значение в памяти: " + calc.getMemory());

        System.out.println("Количество операций: " + calc.getCountOperation());
    }

    public static void versionTwo() {
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int g = 2;

        // для примера был взят CalculatorWithOperator
        // если создать тип через интерфейс, тогда нужно добавлять команду для рассчета операций в интерфейс
        CalculatorWithMemory2 calc = new CalculatorWithMemory2(new CalculatorWithOperator());

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);

        // запись в память последней операции
        calc.setMemoryLastOperation();
        // получение значения из памяти
        System.out.println("Значение в памяти: " + calc.getMemory());

        System.out.println("Количество операций: " + calc.getCountOperation());
    }
}
