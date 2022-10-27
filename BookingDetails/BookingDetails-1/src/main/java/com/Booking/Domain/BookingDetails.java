package com.Booking.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BookingDetails")
public class BookingDetails {
	
	@Id
	@Column(name="Booking_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
 private Integer Id;
	@Column(name="Booking_Date")
 private String Date;
	@Column(name="Booking_Venue")
 private String Venue;
	@Column(name="Booking_SeatNo")
 private String SeatNo;
	@Column(name="Booked_MovieName")
 private String MovieName;
	
public BookingDetails() {
		
		super();
	}

	public BookingDetails(Integer id, String date, String venue, String seatNo, String movieName) {
		super();
		Id = id;
		Date = date;
		Venue = venue;
		SeatNo = seatNo;
		MovieName = movieName;
	}
	@Override
	public String toString() {
		return "BookingDetails [Id=" + Id + ", Date=" + Date + ", Venue=" + Venue + ", SeatNo=" + SeatNo
				+ ", MovieName=" + MovieName + "]";
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
	}
	public String getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
}
