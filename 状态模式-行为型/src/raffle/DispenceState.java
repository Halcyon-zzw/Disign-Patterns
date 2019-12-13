package raffle;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 13:37
 * @Version: 1.0
 */
public class DispenceState implements RaffleState{
    private RaffleActivity raffleActivity;

    public DispenceState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deduceIntegral(int integral) {
        System.out.println("已经扣除积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖状态");
        return false;
    }

    @Override
    public void dispencePrize(String prizeName) {
        System.out.println("奖品" + prizeName + "发放中，请注意查收...");
        raffleActivity.setPrizeCount(raffleActivity.getPrizeCount() - 1);
        if (raffleActivity.getPrizeCount() > 0) {
            //还有奖品，进入初始状态
            raffleActivity.setRaffleState(raffleActivity.getInitialState());
        }else {
            raffleActivity.setRaffleState(raffleActivity.getPrizeOut());
        }
    }
}
