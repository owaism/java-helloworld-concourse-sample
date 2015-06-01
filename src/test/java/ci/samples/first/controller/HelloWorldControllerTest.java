package ci.samples.first.controller;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Owais on 6/1/15.
 */
public class HelloWorldControllerTest {

    @Test
    public void testJustSayIt(){
        Assert.assertEquals("Hello World For Pipelining...",new HelloWorldController().justSayIt());
    }
}
