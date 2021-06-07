package home_work_6;

import java.util.*;

public class DataContainer<T> implements IDataContainer<T> {
    /**
     * Переменные для разных коллекций
     */
    private List listLinkedList;
    private List listArrayList;
    private Set setHashSet;
    private Set setTreeSet;

    /**
     * Переменные входящих параметров. Инициализируются конструктором
     */
    private T data;
    private int amountOfElements;
    private Comparator comparator;

    /**
     * Конструктор для создания экземпляра класса
     * @param data входной параметр для определения типа класса, который передан
     * @param amountOfElements количество элементов
     * @param comparator компаратор для сортировки и для TreeSet
     */
    public DataContainer(T data, int amountOfElements, Comparator comparator) {
        this.data = data;
        this.amountOfElements = amountOfElements;
        this.comparator = comparator;
    }

    /**
     * Метод выводит время выполнения операций по условию задачи
     */
    @Override
    public void start() {
        Utils.print(measurementTimeWorkWithCollections(), this.data.getClass().getSimpleName(),
                this.amountOfElements);
    }

    /**
     * Заполняет LinkedList рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public List<T> fillingLinkedList(int amountOfElements) {
        if (data instanceof Person) {
            List<Person> listLinkedList = new LinkedList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listLinkedList.add(i, new Person(Utils.randomString(Person.MIN_VALUE_NICK,
                        Person.MAX_VALUE_NICK), Utils.randomString(Person.MIN_VALUE_PASSWORD,
                                Person.MAX_VALUE_PASSWORD)));
            }
            this.listLinkedList = listLinkedList;
            return this.listLinkedList;
        } else if (data instanceof Animal) {
            List<Animal> listLinkedList = new LinkedList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listLinkedList.add(i, new Animal(Utils.randomInt(Animal.MIN_VALUE_AGE,
                        Animal.MAX_VALUE_AGE), Utils.randomString(Animal.MIN_VALUE_NICK,
                        Animal.MAX_VALUE_NICK)));
            }
            this.listLinkedList = listLinkedList;
            return this.listLinkedList;
        } else {
            return this.listLinkedList = new LinkedList();
        }
    }

    /**
     * Заполняет ArrayList рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public List<T> fillingArrayList(int amountOfElements) {
        if (data instanceof Person) {
            List<Person> listArrayList = new ArrayList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listArrayList.add(i, new Person(Utils.randomString(Person.MIN_VALUE_NICK,
                        Person.MAX_VALUE_NICK), Utils.randomString(Person.MIN_VALUE_PASSWORD,
                                Person.MAX_VALUE_PASSWORD)));
            }
            this.listArrayList = listArrayList;
            return this.listArrayList;
        } else if (data instanceof Animal) {
            List<Animal> listArrayList = new ArrayList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listArrayList.add(i, new Animal(Utils.randomInt(Animal.MIN_VALUE_AGE,
                        Animal.MAX_VALUE_AGE), Utils.randomString(Animal.MIN_VALUE_NICK,
                        Animal.MAX_VALUE_NICK)));
            }
            this.listArrayList = listArrayList;
            return this.listArrayList;
        } else {
            return this.listArrayList = new ArrayList();
        }
    }

    /**
     * Заполняет HashSet рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public Set<T> fillingHashSet(int amountOfElements) {
        if (data instanceof Person) {
            Set<Person> set = new HashSet<>();
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Person(Utils.randomString(Person.MIN_VALUE_NICK, Person.MIN_VALUE_NICK),
                        Utils.randomString(Person.MIN_VALUE_PASSWORD, Person.MAX_VALUE_PASSWORD)));
            }
            this.setHashSet = set;
            return this.setHashSet;
        } else if (data instanceof Animal) {
            Set<Animal> set = new HashSet<>();
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Animal(Utils.randomInt(Animal.MIN_VALUE_AGE, Animal.MAX_VALUE_AGE),
                        Utils.randomString(Animal.MIN_VALUE_NICK, Animal.MAX_VALUE_NICK)));
            }
            this.setHashSet = set;
            return this.setHashSet;
        } else {
            return this.setHashSet = new HashSet();
        }
    }

    /**
     * Заполняет TreeSet рандомными значениями
     * @param amountOfElements количество элементов
     * @param comparator компаратор
     * @return возвращает коллекцию
     */
    @Override
    public Set<T> fillingTreeSet(int amountOfElements, Comparator comparator) {
        if (data instanceof Person) {
            // при инициализации этого Set обязательно передаем компаратор
            Set<Person> set = new TreeSet<Person>(comparator);
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Person(Utils.randomString(Person.MIN_VALUE_NICK, Person.MAX_VALUE_NICK),
                        Utils.randomString(Person.MAX_VALUE_PASSWORD, Person.MAX_VALUE_PASSWORD)));
            }
            this.setTreeSet = set;
            return this.setTreeSet;
        } else if (data instanceof Animal) {
            // при инициализации этого Set обязательно передаем компаратор
            Set<Animal> set = new TreeSet<Animal>(comparator);
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Animal(Utils.randomInt(Animal.MIN_VALUE_AGE, Animal.MAX_VALUE_AGE),
                        Utils.randomString(Animal.MIN_VALUE_NICK, Animal.MAX_VALUE_NICK)));
            }
            this.setTreeSet = set;
            return this.setTreeSet;
        } else {
            return this.setTreeSet = new TreeSet(comparator);
        }
    }

    /**
     * Сортирует лист при помощи Collections.sort()
     * @param list входной List
     * @param comparator компаратор для сортировки
     * @return возвращает отсортированную коллекцию
     */
    @Override
    public List<T> sortListJDK(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
        return list;
    }

    /**
     * Сортирует Set при помощи TreeSet
     * @param set входной Set
     * @param comparator компаратор для сортировки
     * @return возвращает отсортированную коллекцию
     */
    @Override
    public Set<T> sortSetJDK(Set<T> set, Comparator<T> comparator) {
        TreeSet<T> setSort = new TreeSet<>(set);
        return setSort;
    }

    /**
     * Сортирует коллекцию не с помощью JDK. !!!!! НЕ РЕАЛИЗОВАНО !!!!!!
     * @param collection входной параметр типа Collection
     * @param comparator компаратор для сортировки
     * @return возвращает отсортированную коллекцию
     */
    @Override
    public Collection<T> sortNotJDK(Collection<T> collection, Comparator<T> comparator) {
        return null;
    }

    /**
     * Расчет времени на выполнение операции по условию задачи
     * @return возвращает Map с названием операции и временем на ее выполнение
     */
    @Override
    public Map<String, Long> measurementTimeWorkWithCollections() {
        Map<String, Long> map = new LinkedHashMap<>();

        String operation1 = "Заполнение LinkedList";
        long time1 = System.currentTimeMillis();
        fillingLinkedList(this.amountOfElements);
        long time2 = System.currentTimeMillis();
        long timeFillingLinkedList = time2 - time1;

        String operation2 = "Заполнение ArrayList";
        long time3 = System.currentTimeMillis();
        fillingArrayList(this.amountOfElements);
        long time4 = System.currentTimeMillis();
        long timeFillingArrayList = time4 - time3;

        String operation3 = "Заполнение HashSet";
        long time5 = System.currentTimeMillis();
        fillingHashSet(this.amountOfElements);
        long time6 = System.currentTimeMillis();
        long timeFillingHashSet = time6 - time5;

        String operation4 = "Заполнение TreeSet";
        long time7 = System.currentTimeMillis();
        fillingTreeSet(this.amountOfElements, this.comparator);
        long time8 = System.currentTimeMillis();
        long timeFillingTreeSet = time8 - time7;

        String operation5 = "Итерирование при помощи iterator LinkedList";
        long timeIterator1 = Utils.measurementTimeIteratorList(this.listLinkedList);
        String operation6 = "Итерирование при помощи iterator ArrayList";
        long timeIterator2 = Utils.measurementTimeIteratorList(this.listArrayList);
        String operation7 = "Итерирование при помощи iterator HashSet";
        long timeIterator3 = Utils.measurementTimeIteratorSet(this.setHashSet);
        String operation8 = "Итерирование при помощи iterator TreeSet";
        long timeIterator4 = Utils.measurementTimeIteratorSet(this.setTreeSet);

        String operation9 = "Итерирование при помощи fori LinkedList";
        long timeIterator5 = Utils.measurementTimeNotIterator(this.listLinkedList);
        String operation10 = "Итерирование при помощи fori ArrayList";
        long timeIterator6 = Utils.measurementTimeNotIterator(this.listArrayList);
        String operation11 = "Итерирование при помощи fori HashSet";
        long timeIterator7 = Utils.measurementTimeNotIterator(this.setHashSet);
        String operation12 = "Итерирование при помощи fori TreeSet";
        long timeIterator8 = Utils.measurementTimeNotIterator(this.setTreeSet);

        String operation13 = "Удаление всех элементов при помощи iterator LinkedList";
        long timeRemoveIteratorLinkedList = Utils.measurementTimeIteratorRemoveList(this.listLinkedList);
        String operation14 = "Удаление всех элементов при помощи iterator ArrayList";
        long timeRemoveIteratorArrayList = Utils.measurementTimeIteratorRemoveList(this.listArrayList);
        String operation15 = "Удаление всех элементов при помощи iterator HashSet";
        long timeRemoveIteratorHashSet = Utils.measurementTimeIteratorRemoveSet(this.setHashSet,
                this.comparator);
        String operation16 = "Удаление всех элементов при помощи iterator TreeSet";
        long timeRemoveIteratorTreeSet = Utils.measurementTimeIteratorRemoveSet(this.setTreeSet,
                this.comparator);

        String operation17 = "Удаление всех элементов при помощи clear() LinkedList";
        long timeRemoveLinkedList = Utils.measurementTimeRemove(this.listLinkedList);
        String operation18 = "Удаление всех элементов при помощи clear() ArrayList";
        long timeRemoveArrayList = Utils.measurementTimeRemove(this.listArrayList);
        String operation19 = "Удаление всех элементов при помощи clear() HashSet";
        long timeRemoveHashSet = Utils.measurementTimeRemove(this.setHashSet);
        String operation20 = "Удаление всех элементов при помощи clear() TreeSet";
        long timeRemoveTreeSet = Utils.measurementTimeRemove(this.setTreeSet);

        /*
        Запись результатов в Map
         */
        map.put(operation1, timeFillingLinkedList);
        map.put(operation2, timeFillingArrayList);
        map.put(operation3, timeFillingHashSet);
        map.put(operation4, timeFillingTreeSet);
        map.put(operation5, timeIterator1);
        map.put(operation6, timeIterator2);
        map.put(operation7, timeIterator3);
        map.put(operation8, timeIterator4);
        map.put(operation9, timeIterator5);
        map.put(operation10, timeIterator6);
        map.put(operation11, timeIterator7);
        map.put(operation12, timeIterator8);
        map.put(operation13, timeRemoveIteratorLinkedList);
        map.put(operation14, timeRemoveIteratorArrayList);
        map.put(operation15, timeRemoveIteratorHashSet);
        map.put(operation16, timeRemoveIteratorTreeSet);
        map.put(operation17, timeRemoveLinkedList);
        map.put(operation18, timeRemoveArrayList);
        map.put(operation19, timeRemoveHashSet);
        map.put(operation20, timeRemoveTreeSet);

        return map;
    }
}
