package service;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/12/13 18:20
 * @Version: 1.0
 */
public class ServiceTwo implements Service {
    public String getName() {
        return "service-two";
    }

    public void execute() {
        System.out.println("Executing service-two");
    }
}
