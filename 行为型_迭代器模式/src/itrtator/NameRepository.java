package itrtator;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:26
 * @Version: 1.0
 */
public class NameRepository implements Container {
    private String[] names = {
            "大猪",
            "小罗",
            "小王",
            "小邱",
            "小吕",

    };

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

    /**
     * 改进
     */

}
