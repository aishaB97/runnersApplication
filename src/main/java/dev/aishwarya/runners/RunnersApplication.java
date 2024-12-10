package dev.aishwarya.runners;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnersApplication {

	public static final Logger log =  LoggerFactory.getLogger(RunnersApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(RunnersApplication.class, args);
		log.info("Something Changed by aishwarya");
	}

}
