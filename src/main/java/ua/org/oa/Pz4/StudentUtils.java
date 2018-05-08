package ua.org.oa.Pz4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
public class StudentUtils {
    public static Map<String, Student> createMapFromList(List<Student> students) {
        Map<String, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getFirstName() + student.getLastName(), student);
        }
        return studentMap;
    }

    public static void printStudents(List<Student> students, int course) {
        Iterator iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = (Student) iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }

    public static List<Student> sortStudent(List<Student> students) {
        List<Student> sortedStudentsList = new ArrayList<Student>(students);
        sortedStudentsList.sort(Comparator.comparing(Student::getFirstName));
        return sortedStudentsList;
    }


}

