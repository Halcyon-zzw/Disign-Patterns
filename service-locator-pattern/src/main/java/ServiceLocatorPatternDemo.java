import cache.ServiceLocator;
import service.Service;

/**
 * 服务定位器设计模式
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 18:37
 * @Version: 1.0
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("service-one");
        service.execute();
        System.out.println("========");

        service = ServiceLocator.getService("service-two");
        service.execute();
        System.out.println("========");

        service = ServiceLocator.getService("service-one");
        service.execute();
        System.out.println("========");

        service = ServiceLocator.getService("service-two");
        service.execute();
        System.out.println("========");

    }
}
