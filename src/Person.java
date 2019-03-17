/**
 * Класс для личности.
 *
 * @author Gorkin Alexander
 * @version 0.1 16.03.2019
 */
public class Person {
    /**
     * пенсионный мужской возраст.
     */
    private final int MALE_PENSIONER_AGE = 65;
    /**
     * пенсионный женский возраст.
     */
    private final int FEMALE_PENSIONER_AGE = 60;

    /**
     * Возраст человека.
     */
    private int age;
    /**
     * Имя человека.
     */
    private String name;
    /**
     * Пол человека.
     */
    private Gender gender;

    /**
     * Конструктор.
     *
     * @param name   имя человека.
     * @param age    возраст человека.
     * @param gender пол человека.
     */
    public Person(final String name, final int age, final Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Определяет, является
     * ли человек пенсонером.
     *
     * @return пенсионный возраст
     * для мужчин - 65 лет,
     * для женщин - 60.
     * true - пенсионер, false - в ином случае.
     */
    public boolean isPensioner() {
        if (this.gender == Gender.FAMALE) {
            return (this.age >= FEMALE_PENSIONER_AGE);
        } else {
            return (this.age >= MALE_PENSIONER_AGE);
        }
    }

    /**
     * Вывод информации о человеке.
     */
    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }

}
