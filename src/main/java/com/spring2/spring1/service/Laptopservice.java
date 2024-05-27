package com.spring2.spring1.service;

import com.spring2.spring1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Laptopservice {
    @Autowired
    private Laptoprepository repo;

    public void addLaptop(Laptop lap) {
       // System.out.println("Method called");
        repo.save(lap);
    }
    public boolean isgoodforprogram(Laptop lap)
    {
        return true;
    }
}
