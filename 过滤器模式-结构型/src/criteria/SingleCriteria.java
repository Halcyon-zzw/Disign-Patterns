package criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身标准
 */
public class SingleCriteria implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();

        for (Person person : personList) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
