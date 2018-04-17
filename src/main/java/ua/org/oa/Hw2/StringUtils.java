package ua.org.oa.Hw2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    //Task 1
    public static String changeStr(String s1) {
        return new StringBuilder(s1).reverse().toString();
    }
    //Task 2
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(text);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();
        return text.equalsIgnoreCase(invertedText);

    }
    //Task 3
    public static String CheckLength(String Str) {
        System.out.println(Str.length());
        if (Str.length() > 10) {
            String subStr = Str.substring(0, 6);
            System.out.println(subStr);
            return subStr;
        } else {
            do {
                Str = Str + "o";
            } while (Str.length() < 10);
            System.out.println(Str);
            return Str;
        }
    }
    //Task 4
    public static String ReplaceWorlds(String s1){
        String[] strings = s1.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();

    }
    //Task 5
    public static String ReplaceWorldsTwo(String str) {
        String[] sentence = str.split("[\\.|]\\s?");
        String[] sentenceResult = new String[sentence.length];

        for (int i = 0; i < sentence.length; i++) {
            sentenceResult[i] = sentence[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }

        for (String s : sentenceResult) {
            System.out.println(s);
        }
        return str;
    }
    //Task 6
    public static boolean hasCharacters(String s1) {
        if (s1.matches("[abc]+"))
            return true;
        else return false;
    }
    //Task 7
    public static boolean DateCeck(String s1){
        boolean isDate = false;
        Matcher m = Pattern.compile("(\\d{1,2})\\.(\\d{1,2})\\.\\d{4}").matcher(s1);
        if (m.matches()) {
            int month = Integer.parseInt(m.group(1));
            int day = Integer.parseInt(m.group(2));
            if (month > 0 && month < 13 && day > 0 && day < 32)
                isDate = true;
        }
        return isDate;
    }
    //Task 8
    public static boolean isEmail(String s1) {
        if (s1.matches("[a-zA-Z0-9_.]+@[a-z]+.[a-z]+"))
            return true;
        else return false;
    }
    //Task 9
    public static ArrayList<String> phoneNumbers(String s1) {
        ArrayList<String> numbers=new ArrayList<>();
        Matcher matcher = Pattern.compile("[+]\\d[(]\\d{3}[)]\\d{3}[-]\\d{2}[-]\\d{2}").matcher(s1);
        while (matcher.find())
        {
            numbers.add(matcher.group());
        }
        return numbers;
    }

    public static String markdownParser(String s1) {


        Pattern pattern=Pattern.compile("(\\#+)(.*)");//
        Matcher matcher=pattern.matcher(s1);
        int head=0;
        while (matcher.find())
        {
            head= matcher.group(1).length();
            s1=matcher.replaceAll("<h"+head+">$2</h"+head+">");
        }

        pattern=Pattern.compile("\\s([*]{1})(\\w+)([*]{1})\\s");
        matcher=pattern.matcher(s1);
        s1=(matcher.replaceAll(" <em>$2</em> "));

        pattern=Pattern.compile("\\s([*]{2})(\\w+)([*]{2})\\s");
        matcher=pattern.matcher(s1);
        s1=(matcher.replaceAll(" <strong>$2</strong> "));

        pattern=Pattern.compile("(\\[)(.*)(\\])(\\()(.*)(\\))");
        matcher=pattern.matcher(s1);
        s1=(matcher.replaceAll("<a href=“$5“>$2</a>"));


        String[]line=s1.split("\n");
        StringBuilder sb=new StringBuilder();

        sb.append("<html>\n<body>\n");

        for (int i=0;i<line.length;i++)
        {
            if (line[i].indexOf("<h",0)==-1)
            {
                String l="<p>";
                l+=line[i]+"</p>";
                line[i]=l;
            }
            sb.append(line[i]+"\n");
        }

        sb.append("</body>\n</html>");
        return sb.toString();
    }

}



