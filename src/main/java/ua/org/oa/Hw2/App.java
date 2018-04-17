package ua.org.oa.Hw2;

public class App {
    public static void main(String args[]) {
        System.out.println(StringUtils.markdownParser("##Header line\n" +
            "Simple line *with* em\n" +
            "Simple **line** with strong\n" +
            "Line with link [Link to google](https://www.google.com) in center\n" +
            "Line **with** *many* **elements** and link [Link to FB](https://www.facebook.com)"));
    }
}
