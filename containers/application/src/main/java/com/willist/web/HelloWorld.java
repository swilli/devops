package com.willist.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    private static int num = 0;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        num += 1;
        return "replying to GET request # " + String.valueOf(num) + "...";
    }

}
