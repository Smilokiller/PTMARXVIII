package ua.org.oa.Pz2;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParcerEasy {
    public static void main(String[] args) {
        pasrRank("C:/Users/smilo/Desktop/PTMARXVIII/baby2008.html","windows-1251", "<td>(?<rank>\\d+)<\\/td><td>(?<maleName>\\w+)<\\/td><td>(?<femaleName>\\w+)<\\/td>");


    }
    private static String readFile(String path, String charSet) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = null;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(path), charSet))) {
            while ((s = reader.readLine()) != null) {
                stringBuilder.append(s).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();

    }
    public static List<Rank> pasrRank(String path, String charSet, String regex){
        List<Rank> rankList = new ArrayList<>();
        String html = readFile(path, charSet);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        Rank rank = null;
        while (matcher.find()){
            rank = new Rank();
            rank.setRank(matcher.group("rank"));
            rank.setMaleName(matcher.group("maleName"));
            rank.setFemaleName(matcher.group("femaleName"));
            rankList.add(rank);
            System.out.println(matcher.group("rank"));
            System.out.println(matcher.group("maleName"));
            System.out.println(matcher.group("femaleName" ));

        }
        return rankList;

    }



}
