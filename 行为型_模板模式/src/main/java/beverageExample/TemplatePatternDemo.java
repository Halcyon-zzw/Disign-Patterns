package beverageExample;

/**
 * 模板模式演示类
 *
 *
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 10:59
 * @Version: 1.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("制备咖啡:");
        coffee.prepareBeverageTemplate();
        System.out.println("咖啡好了！");
        System.out.println();

        System.out.println("制备茶:");
        tea.prepareBeverageTemplate();
        System.out.println("茶好了！");
    }
}
