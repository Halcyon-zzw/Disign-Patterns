package filter;

/**
 * debug拦截器
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 16:51
 * @Version: 1.0
 */
public class DebugFilter implements InterceptionFilter {
    @Override
    public void execute(String request) {
        System.out.println("Debug Filter: " + request);
    }
}
