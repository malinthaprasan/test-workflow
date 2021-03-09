package com.example.malintha.fail;

import com.example.malintha.Hello;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloFail {
    @Test
    public void test1(){
        Hello h1 = new Hello();
        String r = h1.method();
        Assert.assertEquals(r, "hello1");
    }
}
