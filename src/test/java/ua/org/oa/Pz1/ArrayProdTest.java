package ua.org.oa.Pz1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProdTest {
    @Test
    public void sum() throws Exception {
        int [] ints = {2,3,4};
        int expected =24;
        int actual = ArrayProd.sum(ints);
        assertEquals("Check static sum()", expected, actual);
    }

}