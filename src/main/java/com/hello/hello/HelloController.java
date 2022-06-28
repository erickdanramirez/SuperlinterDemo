package com.hello.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
* Hello Controller class 
*/ 
@RestController
public class HelloController {

    private string greeting;    
    public static final int FINALAVALUE = 5;
    
    /**
    * Get the geeting variable        
    */    
    public String getGreeting() {    
        return color;
    }
    
    /**
    * Sets the geeting variable
    *
    * @param c  the text of the greeting
    */ 
    public void setGreeting(String c) {
        this.color = c;
    }
    
    /**
    * Index method controller that receives all the requests
    */  
    @RequestMapping("/")
    public String index() {
        setGreeting("Hello World!");
        return getGreeting();
    }
    
    /**
    * api method controller that receives the api routed requests
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
