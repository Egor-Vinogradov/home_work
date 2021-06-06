package home_work_6;

import home_work_6.comparators.AnimalAgeAndNickComparator;

import java.text.DecimalFormat;
import java.util.*;

public class Animal {
    private int age;
    private String nick;

    private static final int MIN_VALUE_AGE = 1;
    private static final int MAX_VALUE_AGE = 15;
    private static final int MAX_VALUE_NICK = 100;

    /**
     * Конструктор для создания объекта.
     * При создании объекта проверяется возраст.
     * Если возраст меньше 1, либо больше 15, тогда создается объект с nick == null и age == 0
     * @param age числовой параметр. Значение должно быть от 1 до 15
     * @param nick строковый параметр
     */
    public Animal(int age, String nick) {
        if (age >= MIN_VALUE_AGE && age <= MAX_VALUE_AGE) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть от 1 до 15 лет!");
            return;
        }
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }

    /**
     * Метод заполняет LinkedList сгенерированными рандомно значениями типа Animal
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает LinkedList
     */
    public static List<Animal> animalFillingLinkedList(int amountOfElements) {
        List<Animal> list = new LinkedList<>();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i, new Animal(Utils.randomInt(MIN_VALUE_AGE, MAX_VALUE_AGE),
                    Utils.randomString(1, MAX_VALUE_NICK)));
        }
        return list;
    }

    /**
     * Метод заполняет ArrayList сгенерированными рандомно значениями типа Animal
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает ArrayList
     */
    public static List<Animal> animalFillingArrayList(int amountOfElements) {
        List<Animal> list = new ArrayList<>();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(i, new Animal(Utils.randomInt(MIN_VALUE_AGE, MAX_VALUE_AGE),
                    Utils.randomString(1, MAX_VALUE_NICK)));
        }
        return list;
    }

    /**
     * Метод заполняет HashSet сгенерированными рандомно значениями типа Animal
     * @param amountOfElements необходимое количество значений для генерации
     * @return возвращает HashSet
     */
    public static Set<Animal> animalFillingHashSet(int amountOfElements) {
        Set<Animal> set = new HashSet<>();
        for (int i = 0; i < amountOfElements; i++) {
            set.add(new Animal(Utils.randomInt(MIN_VALUE_AGE, MAX_VALUE_AGE),
                    Utils.randomString(1, MAX_VALUE_NICK)));
        }
        return set;
    }

    /**
     * Метод заполняет TreeSet сгенерированными рандомно значениями типа Animal
     * @param amountOfElements необходимое количество значений для генерации
     * @param comparator входной параметр типа Comparator
     * @return возвращает TreeSet
     */
    public static Set<Animal> animalFillingTreeSet(int amountOfElements, Comparator comparator) {
        // при инициализации этого Set обязательно передаем компаратор
        Set<Animal> set = new TreeSet<>(comparator);
        for (int i = 0; i < amountOfElements; i++) {
            set.add(new Animal(Utils.randomInt(MIN_VALUE_AGE, MAX_VALUE_AGE),
                    Utils.randomString(1, MAX_VALUE_NICK)));
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
        List<Animal> listLinkedList = animalFillingLinkedList(amountOfElements);
        long time2 = System.currentTimeMillis();
        List<Animal> listArrayList = animalFillingArrayList(amountOfElements);
        long time3 = System.currentTimeMillis();
        Set<Animal> setHashSet = animalFillingHashSet(amountOfElements);
        long time4 = System.currentTimeMillis();
        Set<Animal> setTreeSet = animalFillingTreeSet(amountOfElements, comparator);
        long time5 = System.currentTimeMillis();

        // формат вывода количества значений
        String amountOfElementsStr = new DecimalFormat("#,###").format(amountOfElements);

        // вывод в кончоль времени для заполнения коллекций
        System.out.printf("Для заполнения Animal LinkedList %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time2 - time1);
        System.out.printf("Для заполнения Animal ArrayList %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time3 - time2);
        System.out.printf("Для заполнения Animal HashSet %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time4 - time3);
        System.out.printf("Для заполнения Animal TreeSet %s элементами потребовалось %s мс\n",
                amountOfElementsStr, time5 - time4);

        // определение времения для итератора
        long timeIterator1 = Utils.measurementTimeIteratorList(listLinkedList);
        long timeIterator2 = Utils.measurementTimeIteratorList(listArrayList);
        long timeIterator3 = Utils.measurementTimeIteratorSet(setHashSet);
        long timeIterator4 = Utils.measurementTimeIteratorSet(setTreeSet);

        // вывод в консоль времения для итератора
        System.out.printf("Для итерирования Animal LinkedList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator1);
        System.out.printf("Для итерирования Animal ArrayList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator2);
        System.out.printf("Для итерирования Animal HashSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator3);
        System.out.printf("Для итерирования Animal TreeSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeIterator4);

        // определение времени для итерации с помощью fori
        long timeNotIterator1 = Utils.measurementTimeNotIterator(listLinkedList);
        long timeNotIterator2 = Utils.measurementTimeNotIterator(listArrayList);
        long timeNotIterator3 = Utils.measurementTimeNotIterator(setHashSet);
        long timeNotIterator4 = Utils.measurementTimeNotIterator(setTreeSet);

        // вывод в консоль времени для итерации с помощью fori
        System.out.printf("Для итерирования с помощью fori Animal LinkedList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator1);
        System.out.printf("Для итерирования с помощью fori Animal ArrayList из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator2);
        System.out.printf("Для итерирования с помощью fori Animal HashSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator3);
        System.out.printf("Для итерирования с помощью fori Animal TreeSet из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeNotIterator4);

        // определение времени для очистки коллекции с помощью итератора
        long timeRemove1 = Utils.measurementTimeIteratorRemoveList(listLinkedList);
        long timeRemove2 = Utils.measurementTimeIteratorRemoveList(listArrayList);
        long timeRemove3 = Utils.measurementTimeIteratorRemoveSet(setHashSet, comparator);
        long timeRemove4 = Utils.measurementTimeIteratorRemoveSet(setTreeSet, comparator);

        // вывод в консоль времения для очистки коллекции с помощью итератора
        System.out.printf("Для очистки коллекции Animal LinkedList с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove1);
        System.out.printf("Для очистки коллекции Animal ArrayList с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove2);
        System.out.printf("Для очистки коллекции Animal HashSet с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove3);
        System.out.printf("Для очистки коллекции Animal TreeSet с помощью итератора из %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeRemove4);

        // определение времени для очистки коллекции с помощью clear()
        long timeClear1 = Utils.measurementTimeRemove(listLinkedList);
        long timeClear2 = Utils.measurementTimeRemove(listArrayList);
        long timeClear3 = Utils.measurementTimeRemove(setHashSet);
        long timeClear4 = Utils.measurementTimeRemove(setTreeSet);

        // вывод в консоль времени для очистки коллекции с помощью clear()
        System.out.printf("Для очистки коллекции Animal LinkedList с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear1);
        System.out.printf("Для очистки коллекции Animal ArrayList с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear2);
        System.out.printf("Для очистки коллекции Animal HashSet с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear3);
        System.out.printf("Для очистки коллекции Animal TreeSet с помощью clear() с %s элементов потребовалось %s мс\n",
                amountOfElementsStr, timeClear4);
    }
}
