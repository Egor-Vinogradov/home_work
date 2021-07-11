package home_work_6.supplier;

import home_work_6.Person;
import home_work_6.Utils;

import java.util.function.Supplier;

public class PersonRandom implements Supplier<Person> {
    @Override
    public Person get() {
        return new Person(Utils.randomString(Person.MIN_VALUE_NICK,
                Person.MAX_VALUE_NICK), Utils.randomString(Person.MIN_VALUE_PASSWORD,
                Person.MAX_VALUE_PASSWORD));
    }
}
