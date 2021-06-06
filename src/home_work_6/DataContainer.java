package home_work_6;

import java.util.*;

public class DataContainer<T> implements IDataContainer<T> {
    private List listLinkedList;
    private List listArrayList;
    private Set setHashSet;
    private Set setTreeSet;

    private T data;
    private int amountOfElements;
    private Comparator comparator;

    public DataContainer(T data, int amountOfElements, Comparator comparator) {
        this.data = data;
        this.amountOfElements = amountOfElements;
        this.comparator = comparator;

        fillingLinkedList(this.amountOfElements);
        System.out.println(this.listLinkedList.size() + " " + data.getClass().getSimpleName());
        fillingArrayList(this.amountOfElements);
        System.out.println(this.listArrayList.size() + " " + data.getClass().getSimpleName());
        fillingHashSet(this.amountOfElements);
        System.out.println(this.setHashSet.size() + " " + data.getClass().getSimpleName());
        fillingTreeSet(this.amountOfElements, this.comparator);
        System.out.println(this.setTreeSet.size() + " " + data.getClass().getSimpleName());

    }

    @Override
    public List<T> fillingLinkedList(int amountOfElements) {
        if (data instanceof Person) {
            List<Person> listLinkedList = new LinkedList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listLinkedList.add(i, new Person(Utils.randomString(1, Person.getMaxValueNick()),
                        Utils.randomString(Person.getMinValuePassword(),
                                Person.getMaxValuePassword())));
            }
            this.listLinkedList = listLinkedList;
            return this.listLinkedList;
        } else if (data instanceof Animal) {
            List<Animal> listLinkedList = new LinkedList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listLinkedList.add(i, new Animal(Utils.randomInt(Animal.getMinValueAge(),
                        Animal.getMaxValueAge()),
                        Utils.randomString(1, Animal.getMaxValueNick())));
            }
            this.listLinkedList = listLinkedList;
            return this.listLinkedList;
        } else {
            return this.listLinkedList = new LinkedList();
        }
    }

    @Override
    public List<T> fillingArrayList(int amountOfElements) {
        if (data instanceof Person) {
            List<Person> listArrayList = new ArrayList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listArrayList.add(i, new Person(Utils.randomString(1, Person.getMaxValueNick()),
                        Utils.randomString(Person.getMinValuePassword(),
                                Person.getMaxValuePassword())));
            }
            this.listArrayList = listArrayList;
            return this.listArrayList;
        } else if (data instanceof Animal) {
            List<Animal> listArrayList = new ArrayList<>();
            for (int i = 0; i < amountOfElements; i++) {
                listArrayList.add(i, new Animal(Utils.randomInt(Animal.getMinValueAge(),
                        Animal.getMaxValueAge()),
                        Utils.randomString(1, Person.getMaxValueNick())));
            }
            this.listArrayList = listArrayList;
            return this.listArrayList;
        } else {
            return this.listArrayList = new ArrayList();
        }
    }

    @Override
    public Set<T> fillingHashSet(int amountOfElements) {
        if (data instanceof Person) {
            Set<Person> set = new HashSet<>();
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Person(Utils.randomString(1, Person.getMaxValueNick()),
                        Utils.randomString(Person.getMinValuePassword(),
                                Person.getMaxValuePassword())));
            }
            this.setHashSet = set;
            return this.setHashSet;
        } else if (data instanceof Animal) {
            Set<Animal> set = new HashSet<>();
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Animal(Utils.randomInt(Animal.getMinValueAge(),
                        Animal.getMaxValueAge()),
                        Utils.randomString(1, Animal.getMaxValueNick())));
            }
            this.setHashSet = set;
            return this.setHashSet;
        } else {
            return this.setHashSet = new HashSet();
        }
    }

    @Override
    public Set<T> fillingTreeSet(int amountOfElements, Comparator comparator) {
        if (data instanceof Person) {
            // при инициализации этого Set обязательно передаем компаратор
            Set<Person> set = new TreeSet<>(comparator);
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Person(Utils.randomString(1, Person.getMaxValueNick()),
                        Utils.randomString(Person.getMinValuePassword(),
                                Person.getMinValuePassword())));
            }
            this.setTreeSet = set;
            return this.setTreeSet;
        } else if (data instanceof Animal) {
            // при инициализации этого Set обязательно передаем компаратор
            Set<Animal> set = new TreeSet<>(comparator);
            for (int i = 0; i < amountOfElements; i++) {
                set.add(new Animal(Utils.randomInt(Animal.getMinValueAge(),
                        Animal.getMaxValueAge()),
                        Utils.randomString(1, Animal.getMaxValueNick())));
            }
            this.setTreeSet = set;
            return this.setTreeSet;
        } else {
            return this.setTreeSet = new TreeSet(comparator);
        }
    }
}
