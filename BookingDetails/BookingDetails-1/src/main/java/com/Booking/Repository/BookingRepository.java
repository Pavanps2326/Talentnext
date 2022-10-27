package com.Booking.Repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Booking.Domain.BookingDetails;

@Repository("bookingRepository")
@Scope("singleton")

public interface BookingRepository extends JpaRepository<BookingDetails, Integer>{

	List<BookingDetails> findByMovieNameLike(String MovieName);

}
