package home_work_6.comparators;

import home_work_6.Person;

import java.util.Comparator;

public class PersonPasswordLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        String pass1 = o1.getPassword();
        String pass2 = o2.getPassword();

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

        return password1 - password2;
    }
}
