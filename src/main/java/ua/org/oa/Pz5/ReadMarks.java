package ua.org.oa.Pz5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class ReadMarks {
    public static void main(String[] args) throws ParseException {
        Map students = readFile(new File("C:\\Users\\smilo\\Desktop\\PTMARXVIII\\StudMark.txt"));
        if (students != null) System.out.println("Yt hf,jnftn");
    }

    public static Map readFile(File file) {
        Map<String, Integer> map = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            map = new HashMap<>();
            String text;
            while ((text = br.readLine()) != null) {
                String[] mass = text.substring(0, text.length()).split(" ");
                map.put(mass[0], Integer.parseInt(mass[1]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
