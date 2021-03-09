package com.example.malintha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHello {
    @Test
    public void test1(){
        Hello h1 = new Hello();
        String r = h1.method();
        Assert.assertEquals(r, "hello");
    }
}
