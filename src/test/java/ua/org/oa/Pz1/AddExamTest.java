package ua.org.oa.Pz1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddExamTest {
    @Before
    public void setUp() throws Exception {



    }

    @Test
    public void AddExam() throws Exception {

        int [] Mark = {3,4,5,2};
        int expected =5;
        int actual =  Student.AddExam.getMaximum(Mark);
        assertEquals("Check marks()", expected, actual);
    }

}