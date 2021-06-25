import com.sun.deploy.util.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2020-12-07 10:17
 * @Version: 1.0
 */
public class GenerateDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //TODO
        String path = "主项目目录";
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("项目地址有误。");
        }
        List<String> excludeModule = new ArrayList<String>() {{
            add(".git");
            add(".idea");
        }};

        String modulModel = "<module fileurl=\"file://$PROJECT_DIR$/%s/%s.iml\" filepath=\"$PROJECT_DIR$/%s/%s.iml\" />";
        File[] files = file.listFiles();
        for (File tempFile : files) {
            if (tempFile.isDirectory()) {
                String dirdectoryName = tempFile.getName();
                if (excludeModule.contains(dirdectoryName)) {
                    continue;
                }
                String formatModule = String.format(modulModel, dirdectoryName, dirdectoryName, dirdectoryName, dirdectoryName);
                System.out.println(formatModule);
            }
        }
    }
}
