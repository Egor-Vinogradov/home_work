package home_work_6;

import java.util.*;
import java.util.function.Supplier;

public class DataContainer<T> implements IDataContainer<T> {
    /**
     * Переменные для разных коллекций
     */
    private List<T> listLinkedList;
    private List<T> listArrayList;
    private Set<T> setHashSet;
    private Set<T> setTreeSet;

    /**
     * Переменные входящих параметров. Инициализируются конструктором
     */
    private int amountOfElements;
    private Comparator comparator;
    private Supplier<T> supplier;


    public DataContainer(Supplier<T> supplier, int amountOfElements, Comparator comparator) {
//        this.data = data;
        this.amountOfElements = amountOfElements;
        this.comparator = comparator;
        this.supplier = supplier;
    }

    /**
     * Метод выводит время выполнения операций по условию задачи
     */
    @Override
    public void start() {
        Utils.print(measurementTimeWorkWithCollections(), this.supplier.getClass().getSimpleName(),
                this.amountOfElements);
    }

    /**
     * Заполняет LinkedList рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public List<T> fillingLinkedList(int amountOfElements) {
        List<T> listLinkedList = new LinkedList<>();
        for (int i = 0; i < amountOfElements; i++) {
            listLinkedList.add(i, supplier.get());
        }
        this.listLinkedList = listLinkedList;
        return this.listLinkedList;
    }

    /**
     * Заполняет ArrayList рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public List<T> fillingArrayList(int amountOfElements) {
        List<T> listArrayList = new ArrayList<>();
        for (int i = 0; i < amountOfElements; i++) {
            listArrayList.add(i, supplier.get());
        }
        this.listArrayList = listArrayList;
        return this.listArrayList;
    }

    /**
     * Заполняет HashSet рандомными значениями
     * @param amountOfElements количество элементов
     * @return возвращает коллекцию
     */
    @Override
    public Set<T> fillingHashSet(int amountOfElements) {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < amountOfElements; i++) {
            set.add(supplier.get());
        }
        this.setHashSet = set;
        return this.setHashSet;
    }

    /**
     * Заполняет TreeSet рандомными значениями
     * @param amountOfElements количество элементов
     * @param comparator компаратор
     * @return возвращает коллекцию
     */
    @Override
    public Set<T> fillingTreeSet(int amountOfElements, Comparator comparator) {
        Set<T> set = new TreeSet<T>(comparator);
        for (int i = 0; i < amountOfElements; i++) {
            set.add(supplier.get());
        }
        this.setTreeSet = set;
        return this.setTreeSet;
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
