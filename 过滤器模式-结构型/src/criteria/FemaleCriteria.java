package criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 女标准
 */
public class FemaleCriteria implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();

        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
