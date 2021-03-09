package com.example.malintha.fail;

import com.example.malintha.Hello;
import com.example.malintha.Hello2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloFail2 {
    @Test
    public void test1(){
        Hello2 h1 = new Hello2();
        String r = h1.method();
        Assert.assertEquals(r, "hello22");
    }
}
