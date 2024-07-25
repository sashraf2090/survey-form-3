package com.example.survey_form_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com/example/survey_form_spring_boot/repository")
public class SurveyFormSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurveyFormSpringBootApplication.class, args);
	}

}
