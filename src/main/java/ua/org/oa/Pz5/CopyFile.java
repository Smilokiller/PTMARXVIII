package ua.org.oa.Pz5;

import java.io.*;

public class CopyFile {

        public static void CopyBuffers() {
            long startTime = System.currentTimeMillis();
            BufferedInputStream in = null;
            BufferedOutputStream out = null;
            try {

                in = new BufferedInputStream(new FileInputStream("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\StartText.txt"));
                out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\NewText.txt"));

                byte[] buf = new byte[1024];
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println("Копирования файла с использованием буферизированных потоков занимает " + timeSpent + " миллисекунд");
        }

    public static void CopyNoBuffers() {
        long startTime = System.currentTimeMillis();
        FileInputStream in = null;
        FileOutputStream out = null;
        try {

            in = new FileInputStream("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\StartText1.txt");
            out = new FileOutputStream("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\NewText1.txt");

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Копирования файла с использованием не буферизированных потоков занимает " + timeSpent + " миллисекунд");


    }
    }

