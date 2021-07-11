package home_work_6;

import home_work_6.comparators.AnimalAgeAndNickComparator;
import home_work_6.comparators.PersonPasswordLengthAndNickComparator;
import home_work_6.supplier.AnimalRandom;
import home_work_6.supplier.PersonRandom;


public class Main {
    public static void main(String[] args) {
        // переменная количества элементов для задания
        final int AMOUNT_OF_ELEMENTS = 100000;

        IDataContainer<Person> personDataContainer = new DataContainer<>(new PersonRandom(), AMOUNT_OF_ELEMENTS,
                new PersonPasswordLengthAndNickComparator());

        IDataContainer<Animal> animalDataContainer = new DataContainer<>(new AnimalRandom(), AMOUNT_OF_ELEMENTS,
                new AnimalAgeAndNickComparator());

        /*
        Это не многопоточность!!!
         */
        personDataContainer.start();
        animalDataContainer.start();
    }
}
