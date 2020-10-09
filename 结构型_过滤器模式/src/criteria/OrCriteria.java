package criteria;

import java.util.List;

/**
 * or 标准
 */
public class OrCriteria implements Criteria {

    /**
     * 标准一
     */
    private Criteria criteria;

    /**
     * 标准二
     */
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        List<Person> secondCriteriaPersons = otherCriteria.meetCriteria(personList);

        for (Person person : firstCriteriaPersons) {
            if (! secondCriteriaPersons.contains(person)) {
                secondCriteriaPersons.add(person);
            }
        }

        return secondCriteriaPersons;

    }
}
