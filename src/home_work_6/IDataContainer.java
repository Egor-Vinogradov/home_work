package home_work_6;

import java.util.*;

public interface IDataContainer<T> {
    List<T> fillingLinkedList(int amountOfElements);

    List<T> fillingArrayList(int amountOfElements);

    Set<T> fillingHashSet(int amountOfElements);

    Set<T> fillingTreeSet(int amountOfElements, Comparator comparator);

    List<T> sortListJDK(List<T> list, Comparator<T> comparator);

    Set<T> sortSetJDK(Set<T> set, Comparator<T> comparator);

    Collection<T> sortNotJDK(Collection<T> collection, Comparator<T> comparator);

    Map<String, Long> measurementTimeWorkWithCollections();

    void start();
}
