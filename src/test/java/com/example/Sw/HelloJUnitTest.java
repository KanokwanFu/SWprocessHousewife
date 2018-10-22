/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Sw;

import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Sw.*;
import org.springframework.web.client.RestTemplate;



public class HelloJUnitTest {
    
    @Autowired
    private HelloController hCtrl;
    
    @Autowired
    private HelloRepository helloRepository;
    

    
    public HelloJUnitTest() {
    }
    
    
    @Test
    public void checkPrintEqualToHelloSoftwareDev1(){
        String expect = "Hello Sofftware Development1";
        RestTemplate restTemplate = new RestTemplate();//call controller
        String url = "http://localhost:8081/1";
        Hello result = restTemplate.getForObject(url, Hello.class);//เทียบurlกับobject
        Assert.assertEquals(expect, result.getName());
    }
    
}
