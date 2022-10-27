package com.Booking.Service;

import java.util.List;

import com.Booking.Domain.BookingDetails;



public interface IBookingService {

List<BookingDetails> getAllBookingDetails();
	
	//BookingDetails save(BookingDetails bookingDetails );
	
	//BookingDetails update(BookingDetails bookingDetails);
	
	void delete(int id);
	
	BookingDetails getBookingDetailsById(int id);
	
	List<BookingDetails> getAllBookingDetailsByMovieName(String MovieName);
	
}
