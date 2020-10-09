package raffle;

/**
 * 抽奖状态
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 11:24
 * @Version: 1.0
 */
public interface RaffleState {
    /**
     * 扣除积分
     * @param integral 积分数
     */
    void deduceIntegral(int integral);

    /**
     * 抽奖
     * @return 根据抽奖结果返回是否抽中
     */
    boolean raffle();

    /**
     * 发方奖品
     * @param prizeName 奖品名
     */
    void dispencePrize(String prizeName);
}
