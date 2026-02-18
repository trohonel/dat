package com.example.dat;

import com.example.dat.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class DatApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatApplication.class, args);
	}

}
