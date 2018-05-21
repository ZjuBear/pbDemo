package com.example.QFJavaDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class QfJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QfJavaDemoApplication.class, args);
	}
}
