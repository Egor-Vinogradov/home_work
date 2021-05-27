package home_work_5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        int index = data.length;

        // проверка на null
        if (item == null) return -1;

        // цикл ищет null и вставляет значение
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

    public T get(int index) {
        if (index > data.length) return null;
        return data[index];
    }

    public T[] getItems() {
        return this.data;
    }

    @Override
    public String toString() {
        return "data = " + Arrays.toString(data);
    }
}
