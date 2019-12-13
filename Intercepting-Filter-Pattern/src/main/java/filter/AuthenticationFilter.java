package filter;

/**
 * 认证方式拦截
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 16:49
 * @Version: 1.0
 */
public class AuthenticationFilter implements InterceptionFilter {
    @Override
    public void execute(String request) {
        System.out.println("Authentication request: " + request);
    }
}
