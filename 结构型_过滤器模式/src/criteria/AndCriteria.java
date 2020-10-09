package criteria;

import java.util.List;

/**
 * 混合（and）标准
 */
public class AndCriteria implements Criteria {

    /**
     * 标准一
     */
    private Criteria criteria;

    /**
     * 标准二
     */
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersons);

    }
}
