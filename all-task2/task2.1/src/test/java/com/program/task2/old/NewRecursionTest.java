package com.program.task2.old;

import com.program.task2.old.NewRecursion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NewRecursionTest {

    private NewRecursion recursion;

    @Before
    public void init() {
        recursion = new NewRecursion();
    }

    @Test
    public void changeStringTest1() {
        String line = recursion.changeString("hello");
        Assert.assertEquals(line, "h*e*ll*o");
    }

    @Test
    public void changeStringTest2() {
        String line = recursion.changeString("healo");
        Assert.assertEquals(line, "h*e*a*l*o");
    }

    @Test
    public void changeStringTest3() {
        String line = recursion.changeString("abc");
        Assert.assertEquals(line, "a*bc");
    }

    @Test
    public void changeStringTest4() {
        String line = recursion.changeString("oab");
        Assert.assertEquals(line, "o*a*b");
    }

    @Test
    public void changeStringTest5() {
        String line = recursion.changeString("hello healo abc oab");
        Assert.assertEquals(line, "h*e*ll*o h*e*a*l*o a*bc o*a*b");
    }

}
