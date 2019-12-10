package com.project.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestConverter {

    private Converter converter;

    @Before
    public void init() {
        converter = new Converter();
    }

    @Test
    public void test1() {
        String g = converter.bitConverter('G');
        Assert.assertEquals(g, "00 0 0 0 00 000 0 000");
    }

    @Test
    public void test2() {
        String f = converter.bitConverter('F');
        Assert.assertEquals(f, "00 0 0 0 00 000 0 00 00 0");
    }

}
