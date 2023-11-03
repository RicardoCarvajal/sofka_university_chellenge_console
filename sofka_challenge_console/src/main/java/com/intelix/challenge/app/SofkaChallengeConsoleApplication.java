package com.intelix.challenge.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.intelix.challenge.app.conf.PropertiesConf;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class SofkaChallengeConsoleApplication implements CommandLineRunner {

	PropertiesConf propertiesConf;

	@Autowired
	public SofkaChallengeConsoleApplication(PropertiesConf propertiesConf) {
		this.propertiesConf = propertiesConf;
	}

	public static void main(String[] args) {
		SpringApplication.run(SofkaChallengeConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Iniciando aplicacion");

		log.info("Opcion: " + propertiesConf.getType());

		if (propertiesConf.getType() == 1) {

		} else {

		}

		log.info("Finalizando el proceso");

	}

}
