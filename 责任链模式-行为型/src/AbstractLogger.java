/**
 * @Description: 抽象日志类
 * @Author: zhuzw
 * @Date: 2019/8/2 15:15
 * @Version: 1.0
 */
public abstract class AbstractLogger {
    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 输出日志信息
     * @param level 日志等级
     * @param message 日志信息
     */
    public void logMegger(int level, String message) {
        if(this.level <= level) {
            log(message);
        }
        if (nextLogger != null) {
            nextLogger.logMegger(level, message);
        }
    }

    /**
     * 输出信息
     * @param message 信息内容
     */
    public abstract void log(String message);
}
