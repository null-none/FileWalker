import java.io.File;
import java.util.ArrayList;


public class FileWalker {

    ArrayList<String> result = new ArrayList<String>();

    public ArrayList<String> searchForFormatFiles(File root, String format) {
        if(root == null || result == null) return result;
        if(root.isDirectory()) {
            for(File file : root.listFiles()) {
                searchForFormatFiles(file, format);
            }
        } else if(root.isFile() && root.getName().endsWith(format)) {
            result.add(root.getName());
        }
        return result;
    }


    public ArrayList<String> walk(File root) {

        File[] list = root.listFiles();

        for (File f : list) {
            if (f.isDirectory()) {
                result.add(String.valueOf(f.getAbsoluteFile()));
                walk(f);
            }
            else {
                result.add(String.valueOf(f.getAbsoluteFile()));
            }
        }
        return result;
    }
}
