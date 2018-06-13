package ua.org.oa.Pz5;

import java.io.*;

public class App {
    public static void main(String[] args) {
        String s="";
        String result = DocUtils.randomNumbersInFile(s,10,0,100,"file");
        DocUtils.Writer("task1",result);
        String res = DocUtils.read("task1");
        System.out.println(res);
        String sort = DocUtils.Sorter(res);
        System.out.println(sort);
    }
}
