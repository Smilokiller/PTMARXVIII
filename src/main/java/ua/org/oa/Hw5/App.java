package ua.org.oa.Hw5;

import java.util.Map;
import java.util.Scanner;

public class App {
    Translator tr = new Translator();

    public static void main(String[] args) {
        String regexWord = "(?<word>\\S+?);-;(?<translatedWord>\\S+)";

        Map<String, String> wordmapToRu = Translator.parsWord("EN-RU.txt", "windows-1251", regexWord);
        Map<String, String> wordmapToEn = Translator.parsWord("RU-EN.txt", "windows-1251", regexWord);

        System.out.println("Hi! Select from what to what language u Want translate:\n" +
                "1-RU-EN\n" + "2-En-RU\n");

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("input file name");
        String s = in.next();

        switch (a) {
            case 1:
                System.out.println(Translator.Translator(Translator.Reader(s), wordmapToEn));
            case 2:
                System.out.println(Translator.Translator(Translator.Reader(s), wordmapToRu));
        }
    }
}
