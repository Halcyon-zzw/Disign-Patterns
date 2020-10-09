package itrtator;

/**
 * 名字库-改进
 *
 * @Author: zhuzw
 * @Date: 2019/8/26 19:41
 * @Version: 1.0
 */
public class NameRepositoryImprove implements Container{
    private String[] names = {
            "大猪",
            "小罗",
            "小王",
            "小邱",
            "小吕",

    };

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
