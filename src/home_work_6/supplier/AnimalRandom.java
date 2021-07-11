package home_work_6.supplier;

import home_work_6.Animal;
import home_work_6.Utils;

import java.util.function.Supplier;

public class AnimalRandom implements Supplier<Animal> {
    @Override
    public Animal get() {
        return new Animal(Utils.randomInt(Animal.MIN_VALUE_AGE,
                Animal.MAX_VALUE_AGE), Utils.randomString(Animal.MIN_VALUE_NICK,
                Animal.MAX_VALUE_NICK));
    }
}
