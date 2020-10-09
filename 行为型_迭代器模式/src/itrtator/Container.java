package itrtator;

/**
 * 容器接口
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:25
 * @Version: 1.0
 */
public interface Container {
    /**
     * 获取迭代器
     * @return 返回迭代器
     */
    Iterator getIterator();
}
