package raffle;

/**
 * 奖品为空状态
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 13:49
 * @Version: 1.0
 */
public class PrizeOutState implements RaffleState{
    private RaffleActivity raffleActivity;

    public PrizeOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }
    @Override
    public void deduceIntegral(int integral) {
        System.out.println("奖品已发放完毕，请下次再来！");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已发放完毕，请下次再来！");
        return false;
    }

    @Override
    public void dispencePrize(String prizeName) {
        System.out.println("奖品已发放完毕，请下次再来！");
    }
}
