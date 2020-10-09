import itrtator.Iterator;
import itrtator.NameRepository;
import itrtator.NameRepositoryImprove;

/**
 * 迭代器模式演示类
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:30
 * @Version: 1.0
 */
public class IteratorPatterDemo {
    public static void main(String[] args) {
        nameRepositoryDemo();
        System.out.println("===============");
        nameRepositoryDemoImprove();
    }


    public static void nameRepositoryDemo() {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name:" + name);
        }
    }

    /**
     * 改进演示
     */
    public static void nameRepositoryDemoImprove() {
        NameRepositoryImprove nameRepository = new NameRepositoryImprove();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name:" + name);
        }
    }
}
