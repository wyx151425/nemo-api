package com.rumofuture.nemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author WangZhenqi
 */
@SpringBootApplication
@EnableCaching
public class NemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(NemoApplication.class, args);
	}
}
