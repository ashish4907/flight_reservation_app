package com.home.flight_reservation_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class FlightReservationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightReservationAppApplication.class, args);
		System.out.println(12);
	}

}
