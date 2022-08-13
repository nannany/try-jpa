package com.example.tryjpa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final MyRepository myRepository;

    public Controller(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @GetMapping("test")
    public List<MyEntity> get(){
        return myRepository.findAll();
    }
}
