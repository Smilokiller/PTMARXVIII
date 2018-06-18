package ua.org.oa.Pz5;

import ua.org.oa.Pz5.Student.Group;
import ua.org.oa.Pz5.Student.Student;

public class App {
    public static void main(String[] args) {
        String s="";
        String result = DocUtils.randomNumbersInFile(s,10,0,100,"file");
        DocUtils.Writer("task1",result);
        String res = DocUtils.read("task1");
        System.out.println(res);
        String sort = DocUtils.Sorter(res);
        System.out.println(sort);
        CopyFile.CopyBuffers();
        CopyFile.CopyNoBuffers();

    }
}
