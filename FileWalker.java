import java.io.File;
import java.util.List;

public class FileWalker {

    public static List<String> searchForFormatFiles(File root, List<String> dataOnly, String format) {
        if(root == null || dataOnly == null) return dataOnly;
        if(root.isDirectory()) {
            for(File file : root.listFiles()) {
                searchForFormatFiles(file, dataOnly, format);
            }
        } else if(root.isFile() && root.getName().endsWith(format)) {
            dataOnly.add(root.getName());
        }
        return dataOnly;
    }


    public List<File> walk(File root) {

        File[] list = root.listFiles();
        List<File> dataOnly = null;

        for (File f : list) {
            if (f.isDirectory()) {
                dataOnly.add(f.getAbsoluteFile());
                walk(f);
            }
            else {
                dataOnly.add(f.getAbsoluteFile());
            }
        }
        return dataOnly;
    }
}
