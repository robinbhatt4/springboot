package com.spring2.spring1;

import com.spring2.spring1.model.Alien;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(Spring1Application.class, args);
		//System.out.println("Hello world");
		Alien obj =context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();
	}

}
