package demo2.stragety;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 14:58
 * @Version: 1.0
 */
public class AddOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
