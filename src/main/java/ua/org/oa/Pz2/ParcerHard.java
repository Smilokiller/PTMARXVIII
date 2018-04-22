package ua.org.oa.Pz2;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParcerHard {
    public static void main(String[] args) {

        pasrDesk("C:/Users/smilo/Desktop/PTMARXVIII/source.html", "windows-1251","(\\\">Ноутбук).*?(</a></h6><p class=\\\"description\\\">).*?(<br /><a)");
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

    public static List<Deskription> pasrDesk(String path, String charSet, String regex) {
        List<Deskription> deskList = new ArrayList<>();
        String html = readFile(path, charSet);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        Deskription desk = null;
        while (matcher.find()) {
            desk = new Deskription();
            desk.setId(matcher.group("class"));
            desk.setPrice(matcher.group("descroption"));
            desk.setName(matcher.group("name"));
            desk.setDeskription(matcher.group("deskription"));
            deskList.add(desk);
            System.out.println(matcher.group("class"));
            System.out.println(matcher.group("descroption"));
        }
        return deskList;
    }
}
