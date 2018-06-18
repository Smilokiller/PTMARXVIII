package ua.org.oa.Pz5.Student;

import java.io.*;
import java.util.ArrayList;

public class Group implements Serializable{
    public String Group;
    public String Faculty;
    ArrayList<Student>StudentList;

    public Group(String group, String faculty) {
        Group = group;
        Faculty = faculty;
        this.StudentList=new ArrayList<>();

    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        StudentList = studentList;
    }

    public boolean add (Student student){
        if (student!=null) {
            StudentList.add(student);
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Group{" +
                "Group='" + Group + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", StudentList=" + StudentList +
                '}';
    }
    
}
