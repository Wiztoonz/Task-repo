package com.program.task2.new_recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursionStrV2Test {

    private RecursionStr_v2 recursion;

    @Before
    public void init() {
        recursion = new RecursionStr_v2();
    }

    @Test
    public void changeStringTest1() {
        String line = recursion.interviewRecursion("hello");
        Assert.assertEquals(line, "h*e*ll*o");
    }

    @Test
    public void changeStringTest2() {
        String line = recursion.interviewRecursion("healo");
        Assert.assertEquals(line, "h*e*a*l*o");
    }

    @Test
    public void changeStringTest3() {
        String line = recursion.interviewRecursion("abc");
        Assert.assertEquals(line, "a*bc");
    }

    @Test
    public void changeStringTest4() {
        String line = recursion.interviewRecursion("oab");
        Assert.assertEquals(line, "o*a*b");
    }

}
