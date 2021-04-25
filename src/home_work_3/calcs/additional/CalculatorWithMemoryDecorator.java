package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;
    private double memory;
    private double results;

    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public void setMemoryLastOperation(){
        this.memory = this.results;
    }

    /**
     * Метод возвращает сохраненное в памяти число, при этом "обнуляя" память.
     * @return значение, сохраненное в памяти при помощи метода toMemory
     */
    public double getMemory(){
        double memoryNew = this.memory;
        this.memory = 0;
        return memoryNew;
    }

    @Override
    public double addition(double a, double b) {
        results = calculator.addition(a, b);
        return results;
    }

    @Override
    public double subtraction(double a, double b) {
        results = calculator.subtraction(a, b);
        return results;
    }

    @Override
    public double multiplication(double a, double b) {
        results = calculator.multiplication(a, b);
        return results;
    }

    @Override
    public double division(double a, double b) {
        results = calculator.division(a, b);
        return results;
    }

    @Override
    public double pow(double value, int powValue) {
        results = calculator.pow(value, powValue);
        return results;
    }

    @Override
    public double absNumber(double a) {
        results = calculator.absNumber(a);
        return results;
    }

    @Override
    public double sqrt(double a) {
        results = calculator.sqrt(a);
        return results;
    }
}
