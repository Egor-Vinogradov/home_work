package home_work_5;

import java.util.*;

public class DataContainer<T> {
    private T[] data;

    /**
     * default конструктор
     * Создает новый массив с 10 элементами
     */
    public DataContainer() {
        this.data = (T[]) new Object[10];
    }

    /**
     * конструктор принимает массив и передает его в массив класса
     * @param data принимаемый массив
     */
    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * метод принимает значение и передает его в массив класса
     * @param item переданный элемент
     * @return возвращает -1 если передан null, либо возвращает номер индекса массива
     */
    public int add(T item) {
        int index = data.length;

        // проверка на null
        if (item == null) return -1;

        // цикл ищет первый null и вставляет значение
        for (int i = 0; i < index; i++) {
            if (data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }

        // проверка на переполнение и вставка элемента
        this.data = Arrays.copyOf(data, index + 1);
        data[index] = item;
        return index;
    }

    /**
     * возвращает элемент массива по переданому индексу
     * @param index индекс
     * @return элемент
     */
    public T get(int index) {
        if (index > data.length - 1) return null;
        return data[index];
    }

    /**
     * Возвращает весь массив
     * @return массив
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * Удаляет элемент из массива по переданному индексу. Уменльшает длину массива на один элемент
     * @param index индекс массива
     * @return возвращает значение true либо false, в зависимости от результата
     */
    public boolean delete(int index) {
        // возвращает false если передан индекс не в диапазоне массива
        if (index > data.length - 1 || index < 0) return false;

        // уменьшает длину массива на 1 и возвращает true
        T[] copyArray = (T[]) new Object[data.length - 1];
        int indexArray = 0;
        data[index] = null;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                copyArray[indexArray] = data[i];
                indexArray++;
            }
        }
        this.data = copyArray;
        return true;
    }

    /**
     * Удаляет переданный элемент из массива. Уменьшает длину массива на один элемент
     * @param item элемент массива
     * @return возвращает значение true либо false, в зависимости от результата
     */
    public boolean delete(T item) {
        T[] copyArray = (T[]) new Object[data.length - 1];
        int indexArray = 0;
        // проходим по массиву, если находим, тогда первую часть пишем в новый массив
        for (int i = 0; i < data.length; i++) {
            if (item.equals(data[i])) {
                break;
            }
            // проверяем на переполнение. если переполнен, тогда возвращаем false, т.к. элемент не найден
            if (indexArray >= data.length - 1) return false;

            copyArray[indexArray] = data[i];
            indexArray++;
        }

        // добавляем вторую часть массива, после удаленного элемента
        System.arraycopy(data, indexArray + 1, copyArray, indexArray,
                data.length - indexArray - 1);
        this.data = copyArray;
        return true;
    }

    /**
     * Сортирует массив при помощи переданного компоратора
     * @param comparator компоратор для сортировки. Может быть null
     */
    public void sort(Comparator<T> comparator) {
        // проверка на наличие компоратора
        // если компоратор не передан
        if (comparator == null) {
            for (int i = 0; i < data.length; i++) {
                // проверка на null в элементах массива
                // применяется, если в массиве среди элементов есть null
                if (data[i] == null) {
                    continue;
                }
                // сортировка при помощи Comparable
                for (int j = i; j > 0 && ((Comparable) data[j - 1]).compareTo(data[j]) > 0; j--) {
                    swap(data, j, j - 1);
                }
            }
        // если компоратор передан
        } else {
            for (int i = 0; i < data.length; i++) {
                for (int j = i; j > data.length && comparator.compare(data[j - 1], data[j]) > 0; j--)
                    swap(data, j, j - 1);
            }
        }
    }

    /**
     * Метод для перестановки значений для сортировки
     * @param x переданный массив
     * @param a индекс первоначальный
     * @param b индекс куда переставлять
     */
    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    @Override
    public String toString() {
        int indexArray = 0;

        // проходим по массиву, считаем индексы без null
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) indexArray++;
        }

        // создаем новый массив
        T[] copyArray = (T[]) new Object[indexArray];

        // пишем элементы не null в новый массив
        indexArray = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                copyArray[indexArray] = data[i];
                indexArray++;
            }
        }

        return "data = " + Arrays.toString(copyArray);
    }
}
