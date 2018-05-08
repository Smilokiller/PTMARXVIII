package ua.org.oa.Pz4;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private int course;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "firstName " + firstName +
                " lastName " + lastName  +
                " course" + course ;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String firstName, String lastName, int course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        return firstName.compareTo(o.getFirstName());
    }
}