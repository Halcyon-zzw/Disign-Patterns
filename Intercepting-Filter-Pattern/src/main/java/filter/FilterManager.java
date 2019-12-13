package filter;

/**
 * 拦截器管理类
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 17:03
 * @Version: 1.0
 */
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }


    /**
     * 添加拦截过滤器
     * @param interceptionFilter
     */
    public void addFilter(InterceptionFilter interceptionFilter) {
        filterChain.addFilter(interceptionFilter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
