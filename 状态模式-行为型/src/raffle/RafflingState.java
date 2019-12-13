package raffle;

import java.util.Random;

/**
 * 抽奖状态
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 13:25
 * @Version: 1.0
 */
public class RafflingState implements RaffleState {
    private RaffleActivity raffleActivity;

    public RafflingState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceIntegral(int integral) {
        System.out.println("已扣除积分，请直接抽奖...");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖...");
        Random random = new Random();
        //中奖率为10%
        int num = random.nextInt(10);
        if (6 == num) {
            System.out.println("\033[32;4m" + "<<恭喜中奖>>" + "\033[0m");
            raffleActivity.setRaffleState(raffleActivity.getDispenceState());
            return true;
        }
        System.out.println("很遗憾，没有抽中!");
        raffleActivity.setRaffleState(raffleActivity.getInitialState());
        return false;
    }

    @Override
    public void dispencePrize(String prizeName) {
        System.out.println("没有中奖信息！");
    }
}
