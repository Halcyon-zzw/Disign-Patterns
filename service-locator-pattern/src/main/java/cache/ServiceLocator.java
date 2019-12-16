package cache;

import com.sun.org.apache.xml.internal.security.Init;
import service.Service;



/**
 * 服务定位器
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 18:27
 * @Version: 1.0
 */
public class ServiceLocator {
    private static ServiceCache serviceCache;
    static {
        serviceCache = new ServiceCache();
    }

    /**
     * 获取服务类
     * @param serviceName
     * @return
     */
    public static Service getService(String serviceName) {
        Service service = serviceCache.getService(serviceName);
        if (null == service) {
            System.out.println("not found " + serviceName + "Service!");
            //从现存服务中查询
            InitialContext initialContext = new InitialContext();
            service = initialContext.lookup(serviceName);
            serviceCache.addService(service);
        }else {
            System.out.println("get " + serviceName +" Service from cache");
        }
        return service;
    }
}
