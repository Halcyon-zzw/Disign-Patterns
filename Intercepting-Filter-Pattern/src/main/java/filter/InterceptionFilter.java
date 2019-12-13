package filter;

/**
 * 拦截过滤器
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 16:47
 * @Version: 1.0
 */
public interface InterceptionFilter {
    /**
     * 拦截去处理内容
     * @param request
     */
    void execute(String request);
}
