package ci.samples.first.controller;

/**
 * Created by Owais on 6/1/15.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {


    private static final String RESPONSE = "Hello World!!!!";

    @RequestMapping(value = {"/**/*","/"}, method = RequestMethod.GET)
    @ResponseBody
    public String justSayIt(){
        return RESPONSE;
    }
}
