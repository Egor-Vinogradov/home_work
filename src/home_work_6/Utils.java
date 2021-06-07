package home_work_6;

import java.text.DecimalFormat;
import java.util.*;

public class Utils {
    /*
    Переменная для символов, которые участвуют в рандомной генерации строки
     */
    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static Random rnd = new Random();

    /**
     * Получение строки из рандомных символов длины заданного интервала
     * @param minValue минимальное значение длины строки
     * @param maxValue максимальное значение длины строки
     * @return строка рандомных символов
     */
    public static String randomString(int minValue, int maxValue) {
        StringBuilder sb = new StringBuilder(maxValue);
        for (int i = 1; i <= randomInt(minValue, maxValue); i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        return sb.toString();
    }

    /**
     * Получение рандомного числа типа int
     * @param min минимальное значение числа типа int
     * @param max максимальное значеие числа типа int
     * @return возвращает полученое рандомное число в заданном интервале
     */
    public static int randomInt(int min, int max) {
        int diff = max - min;
        int i = rnd.nextInt(diff + 1);
        i += min;
        return i;
    }

    /**
     * Метод для печати в консоли результата из Map
     * @param map колекция значений для печати: название операции, количество милисекунд
     * @param nameClass название класса для печати
     * @param amountOfElements количество элементов для печати
     */
    public static void print(Map<String, Long> map, String nameClass,int amountOfElements) {
        String formatAmountOfElements = new DecimalFormat("#,###").format(amountOfElements);

        System.out.println("Для класса: " + nameClass + ". Количество элементов: " +
                formatAmountOfElements);
        for (Map.Entry<String, Long> stringLongEntry : map.entrySet()) {
            System.out.println("Операция: " + stringLongEntry.getKey() + ". Заняла: " +
                    stringLongEntry.getValue() + " мс.");
        }
    }

    /**
     * Метод возвращает количество милисекунд для выполнения итерации с помощью итератора для List
     * @param list входной параметр типа List
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeIteratorList(List<?> list) {
        Iterator<?> iterator = list.iterator();
        long time1 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long time2 = System.currentTimeMillis();
        return time2 - time1;
    }

    /**
     * Метод возвращает количество милисекунд для выполнения итерации с помощью итератора для Set
     * @param set входной параметр типа Set
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeIteratorSet(Set<?> set) {
        Iterator<?> iterator = set.iterator();
        long time1 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long time2 = System.currentTimeMillis();
        return time2 - time1;
    }

    /**
     * Метод возвращает количество милисекунд для выполнения итерации с помощью fori для Collection
     * Для прохода выбран путь: перевод коллекции в массив и заполнение массива данными коллекции
     * @param collection входной параметр типа Collection
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeNotIterator(Collection<?> collection) {
        Object[] array = collection.toArray();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            Object o = array[i];
        }
        long time2 = System.currentTimeMillis();
        return time2 - time1;
    }

    /**
     * Метод возвращает количество милисекунд для очистки коллекции с помощью итератора для List
     * @param list входной параметр типа List
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeIteratorRemoveList(List<?> list) {
        /*
        Проверка на тип List, чтобы сделать копию нужного типа
         */
        List<?> listNew;
        if (list instanceof ArrayList) {
            listNew = new ArrayList<>(list);
        } else if (list instanceof LinkedList) {
            listNew = new LinkedList<>(list);
        } else {
            return 0;
        }

        Iterator iterator = listNew.iterator();
        long time1 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        long time2 = System.currentTimeMillis();
        return time2 - time1;
    }

    /**
     * Метод возвращает количество милисекунд для очистки коллекции с помощью итератора для Set
     * @param set входной параметр типа Set
     * @param comparator входной параметр типа Comparator для TreeSet. Необходим для копирования колекции
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeIteratorRemoveSet(Set<?> set, Comparator<?> comparator) {
        /*
        Проверка на тип Set, чтобы сделать копию нужного типа
         */
        Set setNew;
        if (set instanceof HashSet) {
            setNew = new HashSet<>(set);
        } else if (set instanceof TreeSet) {
            setNew = new TreeSet<>(comparator);
            setNew.addAll(set);
        } else {
            return 0;
        }

        Iterator<?> iterator = setNew.iterator();
        long time1 = System.currentTimeMillis();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        long time2 = System.currentTimeMillis();

        return time2 - time1;
    }

    /**
     * Метод возвращает количество милисекунд для очистки коллекции с помощью метода clear()
     * @param collection входной параметр типа Collection
     * @return возвращает количество милисекунд типа long
     */
    public static long measurementTimeRemove(Collection<?> collection) {

        long time1 = System.currentTimeMillis();
        collection.clear();
        long time2 = System.currentTimeMillis();

        return time2 - time1;
    }
}
