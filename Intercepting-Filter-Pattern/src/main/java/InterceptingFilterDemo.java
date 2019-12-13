import filter.AuthenticationFilter;
import filter.DebugFilter;
import filter.FilterManager;
import filter.Target;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 17:08
 * @Version: 1.0
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.addFilter(new AuthenticationFilter());
        filterManager.addFilter(new DebugFilter());

        InterceptingFilterClient interceptingFilterClient = new InterceptingFilterClient();
        interceptingFilterClient.setFilterManager(filterManager);
        interceptingFilterClient.sendRequest("HOME");
    }
}
