package home_work_6.comparators;

import home_work_6.Person;

import java.util.Comparator;

public class PersonPasswordLengthAndNickComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String pass1 = o1.getPassword();
        String pass2 = o2.getPassword();
        int result;

        if(pass1 == null && pass2 != null) {
            return 1;
        }

        if(pass1 != null && pass2 == null) {
            return -1;
        }

        if(pass1 == null && pass2 == null) {
            return 0;
        }

        int password1 = o1.getPassword().length();
        int password2 = o2.getPassword().length();

        result =  password1 - password2;

        if (result == 0) {
            return compareNic(o1, o2);
        } else {
            return result;
        }
    }

    private int compareNic(Person o1, Person o2) {
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
