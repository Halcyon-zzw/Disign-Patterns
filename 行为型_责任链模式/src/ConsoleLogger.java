/**
 * @Description: 控制台日志
 * @Author: zhuzw
 * @Date: 2019/8/2 15:45
 * @Version: 1.0
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger() {
        this.level = Level.INFO;

        setNextLogger(new FileLogger());
    }


    @Override
    public void log(String message) {
        System.out.println("Console logger: " + message);
//        System.out.println("Level: " + level);
    }
}
