package home_work_6.comparators;

import home_work_6.Animal;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();

        if(age1 == 0 && age2 != 0){
            return 1;
        }

        if(age1 != 0 && age2 == 0){
            return -1;
        }

        if(age1 == 0 && age2 == 0){
            return 0;
        }

        return age1 - age2;
    }
}
