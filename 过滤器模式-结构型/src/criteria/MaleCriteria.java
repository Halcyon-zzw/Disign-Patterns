package criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 男标准
 */
public class MaleCriteria implements Criteria {


    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersons = new ArrayList<>();

        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
