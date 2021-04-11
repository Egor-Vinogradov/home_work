package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private Object calculator;
    private long count = 0;

    /**
     * При каждой операции увеличиваем счетчик на 1
     */
    public void incrementCountOperation() {
        count++;
    }

    /**
     * Возвращаем значение счетчика при использовании класса
     * @return возвращает значение счетчика
     */
    public long getCountOperation() {
        return count;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculator) {
        this.calculator = new CalculatorWithOperator();
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculator) {
        this.calculator = new CalculatorWithMathCopy();
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculator) {
        this.calculator = new CalculatorWithMathExtends();
    }
     /** Сложение чисел a и b
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение сложения указанного типа калькулятора
     */
    public double addition(double a, double b) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).addition(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).addition(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).addition(a, b);
        }
        return 0;
    }

    /** Вычитание числа b от a
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение вычитания чисел указанного типа калькулятора
     */
    public double subtraction(double a, double b) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).subtraction(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).subtraction(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).subtraction(a, b);
        }
        return 0;
    }

    /** Умножение числа a на b
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение умножения чисел указанного типа калькулятора
     */
    public double multiplication(double a, double b) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).multiplication(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).multiplication(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).multiplication(a, b);
        }
        return 0;
    }

    /** Деление числа a на b
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение деления чисел указанного типа калькулятора
     */
    public double division(double a, double b) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).division(a, b);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).division(a, b);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).division(a, b);
        }
        return 0;
    }

    /** Возведение числа в степень
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param value входной параметр числа
     * @param powValue входной параметр степени
     * @return возвращает значение возведения числа в степень указанного типа калькулятора
     */
    public double pow(double value, int powValue) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).pow(value, powValue);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).pow(value, powValue);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).pow(value, powValue);
        }
        return 0;
    }

    /** Модуль числа
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @return возвращает значение указанного типа калькулятора
     */
    public double absNumber(double a) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).absNumber(a);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).absNumber(a);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).absNumber(a);
        }
        return 0;
    }

    /** Квадратный корень числа
     * Определяем тип вызываемого калькулятора и делегируем метод. Используется приведение к нужному типу
     * @param a входной параметр
     * @return возвращает значение указанного типа калькулятора
     */
    public double sqrt(double a) {
        incrementCountOperation();
        if (calculator instanceof CalculatorWithOperator) {
            return ((CalculatorWithOperator) calculator).sqrt(a);
        } else if (calculator instanceof CalculatorWithMathCopy) {
            return ((CalculatorWithMathCopy) calculator).sqrt(a);
        } else if (calculator instanceof CalculatorWithMathExtends) {
            return ((CalculatorWithMathExtends) calculator).sqrt(a);
        }
        return 0;
    }
}
