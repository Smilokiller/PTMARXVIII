package ua.org.oa.Pz1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddExamTest {
    @Before
    public void setUp() throws Exception {
        Student Student1 =new Student("Ivan","Ivanov","75b","TM");

        Student.AddExam Exam1 = new Student.AddExam("Math", 2018,2,3);
        Student.AddExam Exam2 = new Student.AddExam("Math", 2018,1,4);
        Student.AddExam Exam3 = new Student.AddExam("Math", 2017,2,5);
        Student.AddExam Exam4 = new Student.AddExam("Math", 2017,1,2);
    }

    @Test
    public void AddExam() throws Exception {

        int [] Mark = {3,4,5,2};
        int expected =5;
        int actual =  Student.AddExam.getMaximum(Mark);
        assertEquals("Check marks()", expected, actual);
    }

}