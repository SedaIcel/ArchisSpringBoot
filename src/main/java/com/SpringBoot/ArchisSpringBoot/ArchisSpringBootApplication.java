package com.SpringBoot.ArchisSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArchisSpringBootApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ArchisSpringBootApplication.class, args);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
