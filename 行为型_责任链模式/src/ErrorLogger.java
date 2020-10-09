/**
 * @Description: 错误日志
 * @Author: zhuzw
 * @Date: 2019/8/2 15:55
 * @Version: 1.0
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = Level.ERROR;

        setNextLogger(null);
    }

    @Override
    public void log(String message) {
        System.out.println("Error logger: " + message);
        System.out.println("Level: " + level);
    }
}
