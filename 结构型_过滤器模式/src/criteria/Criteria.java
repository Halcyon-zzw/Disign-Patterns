package criteria;

import java.util.List;

/**
 * 标准（过滤）的接口
 */
public interface Criteria {
    /**
     * 选择的标准
     * @param personList
     * @return
     */
    List<Person> meetCriteria(List<Person> personList);
}
