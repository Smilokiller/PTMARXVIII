package ua.org.oa.Hw5;

import lombok.Data;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Translator {
    public static String readFromFile(String path, String charSet){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path),charSet))) {
            String s = null;
            while ((s = br.readLine())!= null){
                sb.append(s).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static Map<String ,String > parsWord(String path, String charSet, String regex){
        Map<String, String> hashMap = new HashMap<String, String>();
        String text = readFromFile(path, charSet);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        // Word word=null;
        while (matcher.find()){
            String word = matcher.group("word");
            String translatedWord = matcher.group("translatedWord");
            hashMap.put(word,translatedWord);
        }
        return hashMap;
    }

    @Data
    public static class Word {
        private String word;
        private String translatedWord;
    }

    public static String Reader (String name){
        String text = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get(name), StandardCharsets.UTF_8);
            text = lines.toString();
        } catch (IOException e) {
            System.out.println("File reading Error");
        }
        return text;
    }

    public static String Translator(String text,Map<String,String> Map){
        String[] ret = text.split("[[!:;,.?-]+['*\\s]\\n]+");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < ret.length; i++) {
            if (Map.containsKey(ret[i])) {
                buffer.append(ret[i]+" "+Map.get(ret[i])+" ");
            }else buffer.append(ret[i]+" ");
        }
        return buffer.toString();
    }
}
