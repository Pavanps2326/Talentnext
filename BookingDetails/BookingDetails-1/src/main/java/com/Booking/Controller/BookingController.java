package com.Booking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Booking.Domain.BookingDetails;
import com.Booking.Service.IBookingService;




@RestController
@Scope("request")
public class BookingController {
	
	@Autowired
	@Qualifier("bookingService")
	private IBookingService bookingService;
	
	@GetMapping(value="/Bookings", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<BookingDetails> getAllBookingDetails(){
		
		return bookingService.getAllBookingDetails();		
	}
	

	@DeleteMapping(value = "/Bookings/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBooking(@PathVariable int id ) {
	
		bookingService.delete(id);
	}
	@GetMapping(value="/Bookingsbyid/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public BookingDetails getBookingDetailsById(@PathVariable int id) {
		return bookingService.getBookingDetailsById(id);
	}
	

	@GetMapping(value="/Bookings/{Name}", produces ={MediaType.APPLICATION_JSON_VALUE})
	public List<BookingDetails> getMoviesByLanguage(@PathVariable String MovieName){
		
		return bookingService.getAllBookingDetailsByMovieName(MovieName);
	}
	

}
