package com.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.Booking.Domain.BookingDetails;
import com.Booking.Repository.BookingRepository;

@EnableEurekaClient
@SpringBootApplication
public class BookingDetails1Application implements CommandLineRunner  {

	@Autowired
	@Qualifier("bookingRepository")
	private BookingRepository bookingRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookingDetails1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookingRepository.save(new BookingDetails(0,"26/05/2022","sapthagiri", "D1","Mejestic"));
		
		System.out.println(bookingRepository.findAll());
	}

}
