package com.example.courier;

import com.example.courier.model.LoginEntity;
import com.example.courier.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourierApplication {


	public static void main(String[] args) {
		SpringApplication.run(CourierApplication.class, args);
	}

}
