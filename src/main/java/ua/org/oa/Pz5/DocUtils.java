package ua.org.oa.Pz5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DocUtils {

    public static void Writer(String path,String data){
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
            dos.write(data.getBytes(),0,data.length());

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public static String read(String path) {
        String s="";
        try {
            File file = new File(path);

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                s=s+line;
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s.toString();
    }

    public static String randomNumbersInFile(String s, int quantity, int min, int max,String filename) {
        Random rnd = new Random(System.currentTimeMillis());

        if (min >= max) System.out.println("min should be smaller then max");
        else {
            int a = 0;
            if (min >= 0);
            else {
                a =(min * (-1));
                min +=(min * (-1));
                max += a;
            }

            for (int i = 0; i < quantity; i++) {
                int number = (min + rnd.nextInt(max - min + 1)) - a;
                s += number + " \n";
            }
        }
        return s;
    }


    public  static String Sorter(String s1){
        ArrayList<String> list = new ArrayList();
        list.addAll(Arrays.asList(s1.split("\\s")));
        System.out.println(list);
        Collections.sort(list,(o1,o2)->Integer.parseInt(o1) - Integer.parseInt(o2) );
        return list.toString();

    }



}
