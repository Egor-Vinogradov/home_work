package home_work_6;

public class Animal {
    private int age;
    private String nick;

    public static final int MIN_VALUE_AGE = 1;
    public static final int MAX_VALUE_AGE = 15;
    public static final int MAX_VALUE_NICK = 100;
    public static final int MIN_VALUE_NICK = 1;

    public Animal() {
    }

    /**
     * Конструктор для создания объекта.
     * При создании объекта проверяется возраст.
     * Если возраст меньше 1, либо больше 15, тогда создается объект с nick == null и age == 0
     * @param age числовой параметр. Значение должно быть от 1 до 15
     * @param nick строковый параметр
     */
    public Animal(int age, String nick) {
        if (age >= MIN_VALUE_AGE && age <= MAX_VALUE_AGE) {
            this.age = age;
        } else {
            System.out.println("Возраст должен быть от 1 до 15 лет!");
            return;
        }
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
}
