package com.padre.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HrConfigServerApplication implements  CommandLineRunner{

	@Value("${spring.cloud.config.server.git.username}")
	private String username;
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("USERNAME= "+username);
	}
}
