package duck;

import stragety.FlyWithWing;

/**
 * 绿脖鸭
 *
 * @Author: zhuzw
 * @Date: 2019/8/6 16:44
 * @Version: 1.0
 */
public class GreenNeckDuck extends Duck{
    public GreenNeckDuck() {
        super();
        //提供飞行能力
        super.setFlayingStragety(new FlyWithWing());
    }

    @Override
    public void display() {
        System.out.println("绿脖鸭：脖子是绿色的。");
    }
}
