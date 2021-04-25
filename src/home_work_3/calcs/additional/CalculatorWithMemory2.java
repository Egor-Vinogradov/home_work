package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory2 implements ICalculator {
    private ICalculator calculator;
    private long count;
    // переменная "память"
    private double memory;

    double rezult = 0;

    /**
     * Конструктор принимает значение выбранного вида калькулятора
     * @param calculator возвращает выбранный калькулятор для дальнейшей работы
     */
    public CalculatorWithMemory2(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Функция возвращает значение "памяти" и обнуляет память
     * @return возвращаемое значение
     */
    public double getMemory() {
        double memory1 = this.memory;
        this.memory = 0;
        return memory1;
    }

    /**
     * Функция фиксирует в память операцию, вызванную после определенного метода
     */
    public void setMemoryLastOperation() {
        memory = rezult;
    }

    @Override
    public double addition(double a, double b) {
        count++;
        rezult = calculator.addition(a, b);
        return rezult;
    }

    @Override
    public double subtraction(double a, double b) {
        count++;
        rezult = calculator.subtraction(a, b);
        return rezult;
    }

    @Override
    public double multiplication(double a, double b) {
        count++;
        rezult = calculator.multiplication(a, b);
        return rezult;
    }

    @Override
    public double division(double a, double b) {
        count++;
        rezult = calculator.division(a, b);
        return rezult;
    }

    @Override
    public double pow(double value, int powValue) {
        count++;
        rezult = calculator.pow(value, powValue);
        return rezult;
    }

    @Override
    public double absNumber(double a) {
        count++;
        rezult = calculator.absNumber(a);
        return rezult;
    }

    @Override
    public double sqrt(double a) {
        count++;
        rezult = calculator.sqrt(a);
        return rezult;
    }

    /**
     * Возвращаем значение счетчика при использовании класса
     * @return возвращает значение счетчика
     */
    public long getCountOperation() {
        return count;
    }
}
