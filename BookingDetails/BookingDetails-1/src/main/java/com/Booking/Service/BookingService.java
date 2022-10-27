package com.Booking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.Booking.Domain.BookingDetails;
import com.Booking.Repository.BookingRepository;


@Service("BookingService")
@Scope("singleton")
public class BookingService implements IBookingService{

	@Autowired
	@Qualifier("bookingRepository")
	private BookingRepository bookingRepository;
	
	@Override
	public List<BookingDetails> getAllBookingDetails() {
		return bookingRepository.findAll();
	}
//
//	@Override
//	public BookingDetails save(BookingDetails bookingDetails) {
//		return bookingRepository.save(bookingDetails);
//	}
//
//	@Override
//	public BookingDetails update(BookingDetails bookingDetails) {
//		
//		return bookingRepository.save(bookingDetails);
//		}

	@Override
	public void delete(int id) {
		bookingRepository.deleteById(id);
	}

	@Override
	public BookingDetails getBookingDetailsById(int id) {
		return bookingRepository.findById(id).get();
	}

	@Override
	public List<BookingDetails> getAllBookingDetailsByMovieName(String MovieName) {
		return bookingRepository.findByMovieNameLike(MovieName);
	}

}
