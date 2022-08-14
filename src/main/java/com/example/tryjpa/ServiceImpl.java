package com.example.tryjpa;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    private final MyRepository myRepository;

    public ServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public List<MyEntity> findAll() {
        return myRepository.findAll();
    }
}
