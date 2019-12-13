package raffle;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 14:04
 * @Version: 1.0
 */
public class StateClient {
    public static void main(String[] args) {
        int prizeCount = 2;
        RaffleActivity raffleActivity = new RaffleActivity(prizeCount);

        for (int i = 0; i < 20; i++) {
            System.out.println("==========start" + i + "===========");
            raffleActivity.raffle(10);
            System.out.println("=========end=========");
        }
    }
}
