package edu.ggg.waarestfullab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Waarestfullab2Application {

	public static void main(String[] args) {
		SpringApplication.run(Waarestfullab2Application.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
