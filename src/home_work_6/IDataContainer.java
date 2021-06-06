package home_work_6;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public interface IDataContainer<T> {
    List<T> fillingLinkedList(int amountOfElements);

    List<T> fillingArrayList(int amountOfElements);

    Set<T> fillingHashSet(int amountOfElements);

    Set<T> fillingTreeSet(int amountOfElements, Comparator comparator);
}
