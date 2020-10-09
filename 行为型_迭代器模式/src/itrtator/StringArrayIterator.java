package itrtator;

/**
 * 改进：该类专门针对String[]数据遍历
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:37
 * @Version: 1.0
 */
public class StringArrayIterator implements Iterator{

    private String[] args;

    private int index = 0;

    public StringArrayIterator(String[] args) {
        this.args = args;
    }

    @Override
    public boolean hasNext() {
        if (index < args.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return args[index++];
        }
        return null;
    }
}
