package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Booking;
import com.examly.springapp.repository.BookingRepo;

@Service
public class BookingService {

    @Autowired
    private BookingRepo bookingRepo;

    public Booking addBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    public Booking getBookingById(int id) {
        return bookingRepo.findById(id).orElse(null);
    }

    public void deleteBooking(int id) {
        bookingRepo.deleteById(id);
    }
}
