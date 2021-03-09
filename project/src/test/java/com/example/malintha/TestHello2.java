package com.example.malintha;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHello2 {
    @Test
    public void test1(){
        Hello2 h1 = new Hello2();
        String r = h1.method();
        Assert.assertEquals(r, "hello2");
    }
}
