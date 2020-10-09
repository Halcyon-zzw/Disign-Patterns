package raffle;

/**
 * 初始状态
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 11:23
 * @Version: 1.0
 */
public class InitialState implements RaffleState{

    /**
     * 抽奖活动对象
     */
    private RaffleActivity raffleActivity;
    private int integral;

    public InitialState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceIntegral(int integral) {
        System.out.println("扣除" + integral + "积分，你可以开始抽奖了...");
        raffleActivity.setRaffleState(raffleActivity.getRefflingState());
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖状态...");
        return false;
    }

    @Override
    public void dispencePrize(String prizeName) {
        System.out.println("没有中奖记录...");
    }
}
