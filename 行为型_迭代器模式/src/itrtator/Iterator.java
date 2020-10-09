package itrtator;

/**
 * 迭代器接口
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:21
 * @Version: 1.0
 */
public interface Iterator {
    /**
     * 迭代器是否有下一个元素
     * @return 有返回true，否则返回false
     */
    boolean hasNext();

    /**
     * 返回迭代器当前对象，并跳到下一个对象
     * @return
     */
    Object next();
}
