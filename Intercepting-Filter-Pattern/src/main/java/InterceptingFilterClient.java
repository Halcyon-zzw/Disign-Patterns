import filter.FilterManager;
import lombok.Setter;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 17:07
 * @Version: 1.0
 */
public class InterceptingFilterClient {
    @Setter
    private FilterManager filterManager;

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
