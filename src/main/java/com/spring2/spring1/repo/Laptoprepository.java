package com.spring2.spring1.repo;

import com.spring2.spring1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class Laptoprepository {
    public void save(Laptop lap)
    {
        System.out.println("Saving in database");
    }
    {

    }
}
