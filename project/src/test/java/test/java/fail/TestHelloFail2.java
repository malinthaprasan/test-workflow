package test.java.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.Hello;

public class TestHelloFail2 {
    @Test
    public void test1(){
        Hello h1 = new Hello();
        String r = h1.method();
        Assert.assertEquals(r, "hello2");
    }
}
