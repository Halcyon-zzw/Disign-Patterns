package cache;

import service.Service;
import service.ServiceOne;
import service.ServiceTwo;

/**
 * 查询现有服务类
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 18:24
 * @Version: 1.0
 */
public class InitialContext {
    /**
     * 通过服务名查询服务
     * @param type
     * @return
     */
    public Service lookup(String type) {
        if ("service-one".equalsIgnoreCase(type)) {
            System.out.println("Longing up and creating a new Service-one object...");
            return new ServiceOne();
        }else if("service-two".equalsIgnoreCase(type)) {
            System.out.println("Longing up and creating a new Service-two object...");
            return new ServiceTwo();
        }
        return null;
    }
}
