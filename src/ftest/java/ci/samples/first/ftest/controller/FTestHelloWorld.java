package ci.samples.first.ftest.controller;

/**
 * Created by Owais on 6/1/15.
 */

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class FTestHelloWorld {

    @Test
    public void testHelloWorldService(){
        String ftesturi = System.getProperty("ftesturi");
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(ftesturi);
        String response = target.path("/hello-world").request().get(String.class);
        Assert.assertEquals("Hello World For Pipelining...", response);

    }
}
