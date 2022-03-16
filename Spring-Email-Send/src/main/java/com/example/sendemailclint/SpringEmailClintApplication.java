package com.example.sendemailclint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClintApplication {
@Autowired
private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClintApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
public void tiggerMail()
{
	service.sendSimpleEmail("nagellamanjulanaidu0261@gmail.com"," your booking is done","this mail for you");
}
}
