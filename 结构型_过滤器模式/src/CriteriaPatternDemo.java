import criteria.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤（标准）模式
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("zhuzw", "male", "single"));
        personList.add(new Person("luofeng", "male", "single"));
        personList.add(new Person("xuyq", "female", "single"));
        personList.add(new Person("nijing", "female", "married"));

        Criteria maleCrteria = new MaleCriteria();
        System.out.println("==>Male criteria: ");
        printPersons(maleCrteria.meetCriteria(personList));
        System.out.println();

        Criteria singleCrteria = new SingleCriteria();
        System.out.println("==>single criteria: ");
        printPersons(singleCrteria.meetCriteria(personList));
        System.out.println();

        Criteria andCrteria = new AndCriteria(maleCrteria, singleCrteria);
        System.out.println("==>Male and Single criteria: ");
        printPersons(andCrteria.meetCriteria(personList));
        System.out.println();

        Criteria orCrteria = new OrCriteria(maleCrteria, singleCrteria);
        System.out.println("==>Male or Single criteria: ");
        printPersons(orCrteria.meetCriteria(personList));
        System.out.println();



    }

    private static void printPersons(List<Person> meetCriteria) {
        for (Person person : meetCriteria) {
            System.out.println(person.toString());
        }
    }
}
