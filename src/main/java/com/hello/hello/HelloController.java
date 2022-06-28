package com.hello.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
* Hello Controller class.
*/
@RestController
public class HelloController {

    /**
    * Greeting var.
    */
    private String greeting;    
    /**
    * Final Value variable.
    */
    public static final int FINALAVALUE = 5;
    
    /**
    * Get the geeting variable.
    *
    *@return greeting returns the greeting value
    */
    public String getGreeting() {
        return greeting;
    }
    /**
    * Sets the geeting variable.
    *
    * @param gre the text of the greeting
    */
    public void setGreeting(String gre) {
        this.greeting = gre;
    }
    /**
    * Index method controller that receives all the requests.
    *
    *@return greeting returns the greeting value
    */
    @RequestMapping("/")
    public String index() {
        setGreeting("Hello World!");
        return getGreeting();
    }
    /**
    * api method controller that receives the api routed requests.
    *
    *@return map returns the greeting map value
    */
    @RequestMapping("/api")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> api() {
        HashMap<String, String> map = new HashMap<>();
        int a = FINALAVALUE;
        map.put("greeting", greeting);
        return map;
    }

}
