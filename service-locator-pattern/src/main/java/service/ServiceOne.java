package service;

/**
 * 服务一
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 17:36
 * @Version: 1.0
 */
public class ServiceOne implements Service {
    public String getName() {
        return "service-one";
    }

    public void execute() {
        System.out.println("Executing service-one");
    }
}
