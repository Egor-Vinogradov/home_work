package home_work_6.comparators;

import home_work_6.Animal;

import java.util.Comparator;

public class AnimalAgeAndNickComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        int result;

        if(age1 == 0 && age2 != 0){
            return 1;
        }

        if(age1 != 0 && age2 == 0){
            return -1;
        }

        if(age1 == 0 && age2 == 0){
            return 0;
        }

        result = age1 - age2;

        if (result != 0) {
            return age1 - age2;
        } else {
            return compereNick(o1, o2);
        }
    }

    private int compereNick(Animal o1, Animal o2) {
        String s1 = o1.getNick();
        String s2 = o2.getNick();

        if(s1 == null && s2 != null){
            return 1;
        }

        if(s1 != null && s2 == null){
            return -1;
        }

        if(s1 == null && s2 == null){
            return 0;
        }

        return s1.compareTo(s2);
    }
}
