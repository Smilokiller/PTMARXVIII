package ua.org.oa.Pz5.Student;

import java.util.ArrayList;;
import java.util.List;


public class App {
    public static void main(String[] args) {

        Group group = new Group("BC-34a", "Computer ingeneering");
        group.add(new Student("Ivanov Ivan", 20));
        group.add(new Student("Petrova Ekaterina", 21));
        group.add(new Student("Sidorov Mark", 19));
        group.add(new Student("Korsen Max", 20));
        group.add(new Student("Krul Nikolay", 22));
    System.out.println(group);
    }
}