package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
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
}
