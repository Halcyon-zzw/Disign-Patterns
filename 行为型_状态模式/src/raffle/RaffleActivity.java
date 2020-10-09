package raffle;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 13:20
 * @Version: 1.0
 */

public class RaffleActivity {
    //奖品数量
    private int prizeCount = 3;
    //活动的当前状态，动态变化
    private RaffleState raffleState;

    private InitialState initialState = new InitialState(this);
    private RafflingState refflingState = new RafflingState(this);
    private DispenceState dispenceState = new DispenceState(this);
    private PrizeOutState prizeOutState = new PrizeOutState(this);

    //设置初始状态
    public RaffleActivity() {
        this.raffleState = new InitialState(this);
    }

    public RaffleActivity(int prizeCount){
        this();
        this.prizeCount = prizeCount;
    }

    /**
     * 抽奖
     * @param integral
     */
    public void raffle(int integral) {
        raffleState.deduceIntegral(integral);
        if (raffleState.raffle()) {
            raffleState.dispencePrize("手机");
        }
    }


    public InitialState getInitialState() {
        return initialState;
    }

    public void setInitialState(InitialState initialState) {
        this.initialState = initialState;
    }

    public RafflingState getRefflingState() {
        return refflingState;
    }

    public void setRefflingState(RafflingState refflingState) {
        this.refflingState = refflingState;
    }

    public DispenceState getDispenceState() {
        return dispenceState;
    }

    public void setDispenceState(DispenceState dispenceState) {
        this.dispenceState = dispenceState;
    }


    public RaffleState getRaffleState() {
        return raffleState;
    }

    public void setRaffleState(RaffleState raffleState) {
        this.raffleState = raffleState;
    }

    public PrizeOutState getPrizeOutState() {
        return prizeOutState;
    }

    public void setPrizeOutState(PrizeOutState prizeOutState) {
        this.prizeOutState = prizeOutState;
    }

    public int getPrizeCount() {
        return prizeCount;
    }

    public void setPrizeCount(int prizeCount) {
        this.prizeCount = prizeCount;
    }
}
