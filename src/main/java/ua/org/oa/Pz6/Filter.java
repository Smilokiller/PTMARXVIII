package ua.org.oa.Pz6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filter  extends Thread{
    Thread mainThread;

    static boolean flag;
    public static void processFilesFromFolder() throws IOException {

        func("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\CopyOrSearchPack",".txt");
    }


    public static void func(String path, String find) throws IOException {
        File f = new File(path);
        String[] list = f.list();
        for (String file : list) {
            final String[] finalPath = {path};
             if (find.equals(file)) {
                flag=true;
                System.out.println(finalPath[0] + "\\" + file + " !!!!!!!!!!!!!!!!!!");
                return;
            }
            new Thread(() ->{try { if (!finalPath[0].endsWith("\\")) {
                finalPath[0] += "\\";
                }
                File tempfile = new File(finalPath[0] + file);
                System.out.println(finalPath[0] + file);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\FileNames.txt", true))) {

                    bw.write(finalPath[0] + file + "\n");
                }
                if (!file.equals(".") && !file.equals("..")) {
                    if (tempfile.isDirectory()) {
                        func(finalPath[0] + file, find);
                        if (flag) return;

                }}} catch (IOException e) {
                e.printStackTrace();
            };
        } ).start();


    }
}
}

