package assess;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2019/10/30 16:44
 * @Version: 1.0
 */
public class AssessClient {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Woman("woman1"));
        objectStructure.attach(new Woman("woman2"));
        objectStructure.attach(new Man("man1"));

        objectStructure.display(new Success());

        ObjectStructure objectStructure2 = new ObjectStructure();
        objectStructure2.attach(new Woman("woman2"));
        objectStructure2.attach(new Woman("woman3"));
        objectStructure2.attach(new Man("man2"));

        objectStructure2.display(new Fail());

    }
}
