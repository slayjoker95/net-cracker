package com.nc.ncproject;

import com.nc.ncproject.model.Laptop;
import com.nc.ncproject.Repository.LaptopsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class NcprojectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(NcprojectApplication.class);
		LaptopsRepository repository = context.getBean(LaptopsRepository.class);

		// save a couple of laptops
		repository.save(new Laptop("asus", Long.valueOf(120000), "red"));
		repository.save(new Laptop("acer", Long.valueOf(130000), "green"));


		// fetch all laptops
		Iterable<Laptop> laptops = repository.findAll();
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
		System.out.println();
		context.close();
	}
}
