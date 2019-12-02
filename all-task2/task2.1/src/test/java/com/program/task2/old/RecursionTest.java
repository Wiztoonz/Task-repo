package com.program.task2.old;

import com.program.task2.old.Recursion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursionTest {

    private Recursion recursion;

    @Before
    public void init() {
        recursion = new Recursion();
    }

    @Test
    public void interviewRecursionTest1() {
        String line = recursion.interviewRecursion("hello");
        Assert.assertEquals(line, "h*e*ll*o");
    }

    @Test
    public void interviewRecursionTest2() {
        String line = recursion.interviewRecursion("healo");
        Assert.assertEquals(line, "h*e*a*l*o");
    }

    @Test
    public void interviewRecursionTest3() {
        String line = recursion.interviewRecursion("abc");
        Assert.assertEquals(line, "a*bc");
    }

    @Test
    public void interviewRecursionTest4() {
        String line = recursion.interviewRecursion("oab");
        Assert.assertEquals(line, "o*a*b");
    }

    @Test
    public void interviewRecursionTest5() {
        String line = recursion.interviewRecursion("hello healo abc oab");
        Assert.assertEquals(line, "h*e*ll*o h*e*a*l*o a*bc o*a*b");
    }

}
