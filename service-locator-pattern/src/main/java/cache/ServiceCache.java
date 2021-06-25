package cache;

import service.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务缓存类
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 18:28
 * @Version: 1.0
 */
public class ServiceCache {
    private Map<String, Service> serviceMap = new HashMap<String, Service>();

    public Service getService(String serviceName) {
        return serviceMap.get(serviceName);
    }

    /**
     * 添加缓存service
     * @param service
     */
    public void addService(Service service) {
        serviceMap.put(service.getName(), service);
    }
}
