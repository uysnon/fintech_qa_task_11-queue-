import java.util.Collections;
import java.util.LinkedList;


/**
 * Главный класс задания.
 *
 * @author Gorkin Alexander
 * @version 0.1 16.03.2019
 */
public final class Main {
    /**
     * Приватный конструтор, недоступность
     * создать экзепляр данного класса извне.
     */
    private Main() {

    }

    /**
     * Исполняемый метод приложения.
     *
     * @param args аргумент командной строки
     */
    public static void main(final String[] args) {
        final int QUEUE_CAPACITY = 5;
        final String[][] PERSONS = {
                {"Кирилл", "15", "M"},
                {"Галина", "64", "FM"},
                {"Владимир", "55", "M"},
                {"Юлия", "24", "FM"},
                {"Арина", "31", "FM"},
                {"Оксана", "61", "FM"},
                {"Юрий", "82", "M"},
                {"Захар", "22", "M"}

        };
        LinkedList<Person> personQueue = new LinkedList<>();
        for (int i = 0; i < PERSONS.length; i++) {
            String name = PERSONS[i][0];
            int age = Integer.valueOf(PERSONS[i][1]);
            Gender gender = null;
            if (PERSONS[i][2].equals("M")) {
                gender = Gender.MALE;
            } else if (PERSONS[i][2].equals("FM")) {
                gender = Gender.FAMALE;
            }
            personQueue.add(new Person(name, age, gender));
        }
        Collections.sort(personQueue, new PersonComparator());
        System.out.println("Порядок, в котором"
                + " люди пришли на почту: ");
        for (int i = 0; i < PERSONS.length; i++) {
            System.out.println(PERSONS[i][0] + " " + PERSONS[i][1]);
        }
        System.out.println("\nПорядок, в котором люди"
                + " получили письмо(пенсию)");
        for (; !personQueue.isEmpty();) {
            Person person = personQueue.poll();
            person.printInfo();
        }

    }

}
