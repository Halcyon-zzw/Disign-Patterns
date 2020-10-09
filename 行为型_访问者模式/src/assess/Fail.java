package assess;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:13
 * @Version: 1.0
 */
public class Fail implements Assess {
    @Override
    public void getRestult(Person person) {
        System.out.println(person.getType() + "评价失败！");
    }
}
