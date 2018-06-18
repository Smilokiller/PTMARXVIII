package ua.org.oa.Pz5.Student;

import java.io.Serializable;

public class Student implements Serializable {
    String Name;
    int Age;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Student(String name, int age) {

        Name = name;
        Age = age;
    }
}
