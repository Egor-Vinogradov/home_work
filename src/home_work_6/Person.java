package home_work_6;

import java.text.DecimalFormat;
import java.util.*;

public class Person {
    private String nick;
    private String password;

    private static final int MIN_VALUE_PASSWORD = 5;
    private static final int MAX_VALUE_PASSWORD = 10;
    private static final int MAX_VALUE_NICK = 100;

    /**
     * Конструктор для создания объекта.
     * При создании объекта проверяется длина пароля.
     * Если длина пароля меньше 5, либо больше 10, тогда создается объект с nick == null и password == null
     * @param nick строковый параметр. Может быть любой длины
     * @param password строковый параметр. Длина от 5 до 10 символов
     */
    public Person(String nick, String password) {
        if (password.length() >= MIN_VALUE_PASSWORD && password.length() <= MAX_VALUE_PASSWORD) {
            this.password = password;
        } else {
            System.out.println("Пароль должен быть длиной от 5 до 10 символов!");
            return;
        }
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Person {" +
                "nick = '" + nick + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }

    /**
     * Метод заполняет LinkedList сгенерированными рандомно значениями типа Person
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает LinkedList
     */
    private static List<Person> personFillingLinkedList(int amountOfElements) {
        List<Person> list = new LinkedList<>();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i, new Person(Utils.randomString(1, MAX_VALUE_NICK),
                    Utils.randomString(MIN_VALUE_PASSWORD, MAX_VALUE_PASSWORD)));
        }
        return list;
    }

    /**
     * Метод заполняет ArrayList сгенерированными рандомно значениями типа Person
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает ArrayList
     */
    private static List<Person> personFillingArrayList(int amountOfElements) {
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i, new Person(Utils.randomString(1, MAX_VALUE_NICK),
                    Utils.randomString(MIN_VALUE_PASSWORD, MAX_VALUE_PASSWORD)));
        }
        return list;
    }

    /**
     * Метод заполняет HashSet сгенерированными рандомно значениями типа Person
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает HashSet
     */
    private static Set<Person> personFillingHashSet(int amountOfElements) {
        Set<Person> set = new HashSet<>();
        for (int i = 0; i < amountOfElements; i++) {
            set.add(new Person(Utils.randomString(1, MAX_VALUE_NICK),
                    Utils.randomString(MIN_VALUE_PASSWORD, MAX_VALUE_PASSWORD)));
        }
        return set;
    }

    /**
     * Метод заполняет TreeSet сгенерированными рандомно значениями типа Person
     * @param amountOfElements необходимое количество значений для генерации
     * @param comparator входной параметр типа Comparator
     * @return возвращает TreeSet
     */
    private static Set<Person> personFillingTreeSet(int amountOfElements, Comparator comparator) {
        // при инициализации этого Set обязательно передаем компаратор
        Set<Person> set = new TreeSet<>(comparator);
        for (int i = 0; i < amountOfElements; i++) {
            set.add(new Person(Utils.randomString(1, MAX_VALUE_NICK),
                    Utils.randomString(MIN_VALUE_PASSWORD, MAX_VALUE_PASSWORD)));
        }
        return set;
    }

    /**
     * Метод выводит на печать данные, согласно условию задачи
     * @param amountOfElements необходимое количество значений для генерации
     * @param comparator входной параметр типа Comparator
     */
    public static void measurementTime(int amountOfElements, Comparator comparator) {
        // генерируем значения и заполняем коллекции
        long time1 = System.currentTimeMillis();
        List<Person> listLinkedList = personFillingLinkedList(amountOfElements);
        long time2 = System.currentTimeMillis();
        List<Person> listArrayList = personFillingArrayList(amountOfElements);
        long time3 = System.currentTimeMillis();
        Set<Person> setHashSet = personFillingHashSet(amountOfElements);
        long time4 = System.currentTimeMillis();
        Set<Person> setTreeSet = personFillingTreeSet(amountOfElements, comparator);
        long time5 = System.currentTimeMillis();

        // формат вывода количества значений
        String amountOfElementsStr = new DecimalFormat("#,###").format(amountOfElements);

        // вывод в кончоль времени для заполнения коллекций
        System.out.printf("Для заполнения Person LinkedList %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time2 - time1);
        System.out.printf("Для заполнения Person ArrayList %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time3 - time2);
        System.out.printf("Для заполнения Person HashSet %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time4 - time3);
        System.out.printf("Для заполнения Person TreeSet %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time5 - time4);

        // определение времения для итератора
        long timeIterator1 = Utils.measurementTimeIteratorList(listLinkedList);
        long timeIterator2 = Utils.measurementTimeIteratorList(listArrayList);
        long timeIterator3 = Utils.measurementTimeIteratorSet(setHashSet);
        long timeIterator4 = Utils.measurementTimeIteratorSet(setTreeSet);

        // вывод в консоль времения для итератора
        System.out.printf("Для итерирования Person LinkedList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator1);
        System.out.printf("Для итерирования Person ArrayList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator2);
        System.out.printf("Для итерирования Person HashSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator3);
        System.out.printf("Для итерирования Person TreeSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator4);

        // определение времени для итерации с помощью fori
        long timeNotIterator1 = Utils.measurementTimeNotIterator(listLinkedList);
        long timeNotIterator2 = Utils.measurementTimeNotIterator(listArrayList);
        long timeNotIterator3 = Utils.measurementTimeNotIterator(setHashSet);
        long timeNotIterator4 = Utils.measurementTimeNotIterator(setTreeSet);

        // вывод в консоль времени для итерации с помощью fori
        System.out.printf("Для итерирования с помощью fori Person LinkedList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator1);
        System.out.printf("Для итерирования с помощью fori Person ArrayList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator2);
        System.out.printf("Для итерирования с помощью fori Person HashSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator3);
        System.out.printf("Для итерирования с помощью fori Person TreeSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator4);

        // определение времени для очистки коллекции с помощью итератора
        long timeRemove1 = Utils.measurementTimeIteratorRemoveList(listLinkedList);
        long timeRemove2 = Utils.measurementTimeIteratorRemoveList(listArrayList);
        long timeRemove3 = Utils.measurementTimeIteratorRemoveSet(setHashSet, comparator);
        long timeRemove4 = Utils.measurementTimeIteratorRemoveSet(setTreeSet, comparator);

        // вывод в консоль времения для очистки коллекции с помощью итератора
        System.out.printf("Для очистки коллекции Person LinkedList с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove1);
        System.out.printf("Для очистки коллекции Person ArrayList с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove2);
        System.out.printf("Для очистки коллекции Person HashSet с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove3);
        System.out.printf("Для очистки коллекции Person TreeSet с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove4);

        // определение времени для очистки коллекции с помощью clear()
        long timeClear1 = Utils.measurementTimeRemove(listLinkedList);
        long timeClear2 = Utils.measurementTimeRemove(listArrayList);
        long timeClear3 = Utils.measurementTimeRemove(setHashSet);
        long timeClear4 = Utils.measurementTimeRemove(setTreeSet);

        // вывод в консоль времени для очистки коллекции с помощью clear()
        System.out.printf("Для очистки коллекции Person LinkedList с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear1);
        System.out.printf("Для очистки коллекции Person ArrayList с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear2);
        System.out.printf("Для очистки коллекции Person HashSet с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear3);
        System.out.printf("Для очистки коллекции Person TreeSet с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear4);
    }
}
