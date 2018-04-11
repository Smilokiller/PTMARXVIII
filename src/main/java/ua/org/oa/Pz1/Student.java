package ua.org.oa.Pz1;

import java.util.Arrays;

public class Student {
     String Name;
     String Surmane;
     String Group;
     String [] Exams;
     String Faculty;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surmane='" + Surmane + '\'' +
                ", Group='" + Group + '\'' +
                ", Exams=" + Arrays.toString(Exams) +
                ", Faculty='" + Faculty + '\'' +
                '}';
    }

    public Student(String name, String surmane, String group, String faculty) {
        Name = name;
        Surmane = surmane;
        Group = group;
        Faculty = faculty;

    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurmane() {
        return Surmane;
    }

    public void setSurmane(String surmane) {
        Surmane = surmane;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }

    public String[] getExams() {

        return Exams;

    }

    public void setExams(String[] exams) {
        Exams = exams;
    }



    public static String NameAdd(String Name, String Surmane){



    return String.valueOf(0);
    }



    public static class AddExam {
        String Exam;
        int [] Mark= {3,4,3,2};
        int Year;
        int Semestr;


        public AddExam(String exam,  int year, int semestr, int[] mark) {
            Exam = exam;
            Mark = mark;
            Year = year;
            Semestr = semestr;
        }

        public AddExam(String exam, int year, int semestr, int mark) {

        }


        @Override
        public String toString() {
            return "AddExam{" +
                    "Exam='" + Exam + '\'' +
                    ", Mark=" + Arrays.toString(Mark) +
                    ", Year=" + Year +
                    ", Semestr=" + Semestr +
                    '}';
        }


        static int getMaximum(int[]  Mark){

            int max = 0;
            for (int i = 0; i < Mark.length; i++)
                if (max < Mark[i])
                    max =Mark[i];
            return max;




        }

        public String getExam() {
            return Exam;
        }

        public void setExam(String exam) {
            Exam = exam;
        }

        public int[] getMark() {
            return Mark;
        }

        public void setMark(int[] mark) {
            Mark = mark;
        }

        public int getYear() {
            return Year;
        }

        public void setYear(int year) {
            Year = year;
        }

        public int getSemestr() {
            return Semestr;
        }

        public void setSemestr(int semestr) {
            Semestr = semestr;
        }
    }

}
