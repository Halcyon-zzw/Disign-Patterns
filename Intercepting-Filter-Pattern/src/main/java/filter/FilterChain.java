package filter;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器链
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 16:53
 * @Version: 1.0
 */
public class FilterChain {
    private List<InterceptionFilter> interceptionFilters = new ArrayList<>();

    /**
     * 拦截的目标
     */
    @Setter
    private Target target;

    /**
     * 添加拦截器
     * @param interceptionFilter
     */
    public void addFilter(InterceptionFilter interceptionFilter) {
        interceptionFilters.add(interceptionFilter);
    }

    /**
     * 执行拦截器链中的拦截器
     * @param request
     */
    public void execute(String request) {
        for (InterceptionFilter interceptionFilter : interceptionFilters) {
            interceptionFilter.execute(request);
        }
        target.execute(request);
    }
}
