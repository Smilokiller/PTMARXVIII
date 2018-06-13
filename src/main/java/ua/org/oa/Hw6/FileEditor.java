package ua.org.oa.Hw6;

import java.io.File;
import java.io.IOException;

public class FileEditor {
    public static boolean deleteFile(String file){
        System.out.println("Delete File "+file);
        return new File(file).delete();
    }

    public static boolean renameToFile(String file,String to){
        System.out.println("Rename To "+file+"->"+to);
        return new File(file).renameTo(new File(to));
    }

    public static boolean newFile(String file){
        System.out.println("New File "+file);
        try {
            return new File(file).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
