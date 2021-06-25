package demo2.stragety;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-15 14:59
 * @Version: 1.0
 */
public class MultiplyOperaion implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
