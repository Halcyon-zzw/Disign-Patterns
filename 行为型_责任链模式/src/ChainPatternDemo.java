/**
 * @Description: 责任链模式演示类
 * @Author: zhuzw
 * @Date: 2019/8/2 16:04
 * @Version: 1.0
 */
public class ChainPatternDemo {
    public static void main(String[] args) {

        /**
         * 暴露最低等级既可
         */
        AbstractLogger consoleLogger = new ConsoleLogger();
        consoleLogger.logMegger(3, "错误信息");
        System.out.println();
        consoleLogger.logMegger(2, "测试信息");
        System.out.println();
        consoleLogger.logMegger(1, "控制台信息");
    }
}
