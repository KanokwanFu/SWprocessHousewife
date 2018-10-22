package com.example.Sw;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Autowired
    private HelloRepository testRepostory;
           
    //@RequestMapping(path = "/", method=)
    
     
    @GetMapping("/")
    public List<Hello> getAllHello(){
        return testRepostory.findAll();
    }
    
   
    @GetMapping("/{hello_id}")
    public Optional<Hello> getHello(@PathVariable("hello_id") int id){
        return testRepostory.findById(id);
    }
}
