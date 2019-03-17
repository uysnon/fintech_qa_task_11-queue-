import java.util.Comparator;

/**
 * Компаратор для сравнения двух людей.
 * @author Gorkin Alexander
 * @version 0.1 16.03.2019
 */
public class PersonComparator implements Comparator<Person> {
    /**
     * @param o1 - объект 1 класса Person
     * @param o2 - объект 2 клсса Person
     * @return положительное число
     * - привелегия первого человека,
     * отрицательное чило
     * - привелегия второго человека,
     * ноль - привелегии одинаковые
     */
    @Override
    public int compare(final Person o1, final Person o2) {
        if (o1.isPensioner() && (!o2.isPensioner())) {
            return -1;
        }
        if ((!o1.isPensioner()) && o2.isPensioner()) {
            return 1;
        }
        return 0;
    }
}
