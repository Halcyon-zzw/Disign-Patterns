/**
 * @Description: TODO
 * @Author: zhuzw
 * @Date: 2019/8/2 16:01
 * @Version: 1.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger() {
        this.level = Level.DEBUG;

        setNextLogger(new ErrorLogger());
    }

    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
//        System.out.println("Level: " + level);
    }
}
