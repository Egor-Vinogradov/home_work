package home_work_6;

import home_work_6.comparators.AnimalAgeAndNickComparator;
import home_work_6.comparators.PersonPasswordLengthAndNickComparator;


public class Main {
    public static void main(String[] args) {
        final int AMOUNT_OF_ELEMENTS = 1000000;
        Person.measurementTime(AMOUNT_OF_ELEMENTS, new PersonPasswordLengthAndNickComparator());
        Animal.measurementTime(AMOUNT_OF_ELEMENTS, new AnimalAgeAndNickComparator());
    }
}
