package ua.org.oa.Hw6;

import java.util.Arrays;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------");
        WorkWithBooks.addBooks("Books", true,
                new Book("AUTHOR", "TITLE", 2000),
                new Book("Book", "2", 2002),
                new Book("Book", "2", 2002)
        );

        Collection<Book> ListB = WorkWithBooks.getBook("Books", "utf-8");
        System.out.println(ListB);
        System.out.println("----------------------------------------------------------------------");

        WorkWithBooks.serializable("BookSerial", Arrays.asList(
                new Book("new title", "new author", 2005),
                new Book("new", "new", 2005)
        ));

        System.out.println(WorkWithBooks.deSerializable("BookSerial"));
        System.out.println("----------------------------------------------------------------------");

        FileEditor.newFile("new  file1");
        FileEditor.renameToFile("Book", "book ");
        FileEditor.deleteFile("boo");

    }
}