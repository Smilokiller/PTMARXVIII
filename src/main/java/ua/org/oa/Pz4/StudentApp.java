package ua.org.oa.Pz4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static ua.org.oa.Pz4.StudentUtils.*;
import static ua.org.oa.Pz4.WordsSort.countWords;

public class StudentApp {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ivan", "Ivanov", 3));
        studentList.add(new Student("Petr", "Sidorov", 2));
        studentList.add(new Student("Masha", "Petrova", 1));
        studentList.add(new Student("Kostya", "Kosha", 4));
        studentList.add(new Student("Pasha", "Parko", 2));

        Map<?, ?> map = createMapFromList(studentList);
        printStudents(studentList, 2);
        List<Student> sort = sortStudent(studentList);

        for (int i = 0; i < sort.size(); i++) {
            System.out.println(sort.get(i).getFirstName());
        }
        Map map1 = countWords("C:/Users//smilo/Desktop/PTMARXVIII/Romeo.txt");
        System.out.println(map1.toString());

        Map map2 = countWords("C:/Users//smilo/Desktop/PTMARXVIII/Romeo.txt", WordsSortEn.COUNT_WORD_DESC);
        System.out.println(map2.toString());
    }

    }

