package com.intelix.challenge.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class SofkaChallengeConsoleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SofkaChallengeConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando aplicacion");

	}

}
