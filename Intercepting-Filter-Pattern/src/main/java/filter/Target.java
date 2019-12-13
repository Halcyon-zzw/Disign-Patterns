package filter;

/**
 * 需要拦截的目标
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 16:52
 * @Version: 1.0
 */
public class Target {
    public void execute(String request) {
        System.out.println("Executing request:" + request);
    }
}
