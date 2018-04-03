package ua.org.oa.Pz1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Before
    public void setUp() throws Exception {
        int [] ints1 = {2,3,4};
        int expected =9;
        int actual = ArraySum.Ssum(ints1);
        assertEquals("Check static sum()", expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void tearDown() throws Exception {
        int []interr =null;
        int expected = 2;
        int actual = ArraySum.err(interr);
        assertEquals("Check static sum()", expected, actual);

    }

    @Test
    public void Ssum() throws Exception {


    }


    @Test
    public void sum() throws Exception {
        int [] ints = {1,2,3};
        int expected =6;
        int actual = ArraySum.sum(ints);
        assertEquals("Check static sum()", expected, actual);


    }

}