package ua.org.oa.Hw2;

import org.junit.Assert;
import org.junit.Test;


public class StringUtilsTest {
    @Test
    public void changeStr() throws Exception {
        String s= StringUtils.changeStr("Hello world!");
        if(!s.equals("!dlrow olleH"))
            throw new Exception("Reverse Error");
    }

    @Test
    public void isPalindrome() throws Exception {
        boolean text = StringUtils.isPalindrome("А роза упала на лапу Азора");
        Assert.assertTrue(text);
    }

    @Test
    public void checkLength() throws Exception {
        String actual = StringUtils.CheckLength("12345678910");
        String expected ="123456";
        Assert.assertEquals(expected, actual);
        actual = StringUtils.CheckLength("12345");
        expected ="12345ooooo";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceWorlds() throws Exception {
        String actual =StringUtils.ReplaceWorlds("Mama mila ramu");
        String expected ="ramu mila Mama";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceWorldsTwo() throws Exception {
        String actual = StringUtils.ReplaceWorldsTwo("Today bad day for fishing. Try to catch fish tomorrow");
        String expected ="fishing bad day for Today. tomorrow to catch fish Try";
    }

    @Test
    public void hasCharacters() throws Exception {
        boolean actual = StringUtils.hasCharacters("acbcbacbabcb" );
        boolean expected = true;
        Assert.assertEquals(expected, actual);
        boolean actualF = StringUtils.hasCharacters("sghsghngbgfj");
        boolean expectedF = false;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dateCeck() throws Exception {
        boolean actual = StringUtils.DateCeck("2.3.2018");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
        boolean actual1 = StringUtils.DateCeck("35.01.2016");
        boolean expected1 = false;
        Assert.assertEquals(expected1, actual1);
        boolean actual2 = StringUtils.DateCeck("vv.bb.gggg");
        boolean expected2 = false;
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void isEmail() throws Exception {
        boolean actual = StringUtils.isEmail("Name@gmail.com");
        boolean expected = true;
        Assert.assertEquals(expected, actual);
        boolean actual1 = StringUtils.isEmail("pqwoeqw.ckkcnd12");
        boolean expected1 = false;
        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void phoneNumbers() throws Exception {
        String actual=(StringUtils.phoneNumbers("+8(099)123-45-67, 284391972340, " +
                "+3(806)888-11-55, 700-70-7, 340-34-34").toString());
        String expected = "[+8(099)123-45-67, +3(806)888-11-55]";
        Assert.assertEquals(expected, actual);
    }

}