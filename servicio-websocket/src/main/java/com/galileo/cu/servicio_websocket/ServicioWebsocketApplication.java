package com.galileo.cu.servicio_websocket;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServicioWebsocketApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ServicioWebsocketApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**************************************");
		System.out.println("Websocket V-24009101539");
	}
}
