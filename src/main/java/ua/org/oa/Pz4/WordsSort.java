package ua.org.oa.Pz4;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class WordsSort {
    public static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] strings = line.split("[ ,.:;!?\\-}'{\n\t\\d]");

            for (int i = 0; i < strings.length; i++) {
                if (strings[i].equals("")) {
                    continue;
                }
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i], 1);
                } else {
                    map.put(strings[i], map.get(strings[i]) + 1);
                }
            }
        }
        return map;
    }

    public static Map<String, Integer> countWords(String filePath, WordsSortEn sortDirection) throws IOException {
        Map<String, Integer> map = countWords(filePath);
        List<String> keyList = new ArrayList(map.keySet());
        List<Integer> valueList = new ArrayList(map.values());
        Map<String, Integer> sortedMap = new LinkedHashMap<>();

        switch (sortDirection) {
            case WORD_ASC:
                keyList.sort(Comparator.comparing(String::toString));
                for (String aKeyList : keyList) {
                    sortedMap.put(aKeyList, map.get(aKeyList));
                }
                break;
            case WORD_DESC:
                keyList.sort(Comparator.comparing(String::toString).reversed());
                for (String aKeyList : keyList) {
                    sortedMap.put(aKeyList, map.get(aKeyList));
                }
                break;
            case COUNT_WORD_ASC:
                valueList.sort(Comparator.comparing(Integer::intValue));
                for (Integer aValueList : valueList) {
                    for (String s :
                            keyList) {
                        if (map.get(s).equals(aValueList) && !sortedMap.containsKey(s)) {
                            sortedMap.put(s, aValueList);
                        }
                    }
                }
                break;
            case COUNT_WORD_DESC:
                valueList.sort(Comparator.comparing(Integer::intValue).reversed());
                for (Integer aValueList : valueList) {
                    for (String s :
                            keyList) {
                        if (map.get(s).equals(aValueList) && !sortedMap.containsKey(s)) {
                            sortedMap.put(s, aValueList);
                        }
                    }
                }
                break;
            default:
                sortedMap = map;
                break;
        }
        return sortedMap;
    }
}
