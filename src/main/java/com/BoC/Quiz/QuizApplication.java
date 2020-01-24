package com.BoC.Quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class QuizApplication {
	
	public static void main(String[] args) throws CsvValidationException, IOException {
		SpringApplication.run(QuizApplication.class, args);
		
	}
	

}
