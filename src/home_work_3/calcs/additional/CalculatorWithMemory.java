package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private ICalculator calculator;
    private long count;
    // добавляем массив для функции "память"
    private double[] arr;
    // переменная "память"
    private double memory;

    /**
     * Конструктор принимает значение выбранного вида калькулятора
     * @param calculator возвращает выбранный калькулятор для дальнейшей работы
     */
    public CalculatorWithMemory(ICalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Функция возвращает значение "памяти"
     * @return возвращаемое значение
     */
    public double getMemory() {
        return memory;
    }

    /**
     * Функция записывает в память значение каждой операции ПОДРЯД. Чистит предыдущее значение
     * @param rezult
     * @return
     */
    public double[] setMemoryOperation(double rezult) {
        arr = null;
        // Инициализируем новый массив.
        arr = new double[(int) count];
        // добавляем элемент в массив
        arr[(int) count - 1] = rezult;

        return arr;
    }

    /**
     * Функция фиксирует в память операцию, вызванную после определенного метода
     */
    public void setMemoryLastOperation() {
        memory = arr[(int) count - 1];
    }

    @Override
    public double addition(double a, double b) {
        count++;
        double rezult = calculator.addition(a, b);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double subtraction(double a, double b) {
        count++;
        double rezult = calculator.subtraction(a, b);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double multiplication(double a, double b) {
        count++;
        double rezult = calculator.multiplication(a, b);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double division(double a, double b) {
        count++;
        double rezult = calculator.division(a, b);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double pow(double value, int powValue) {
        count++;
        double rezult = calculator.pow(value, powValue);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double absNumber(double a) {
        count++;
        double rezult = calculator.absNumber(a);
        setMemoryOperation(rezult);
        return rezult;
    }

    @Override
    public double sqrt(double a) {
        count++;
        double rezult = calculator.sqrt(a);
        setMemoryOperation(rezult);
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
