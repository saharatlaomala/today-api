package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.BookingsDto;
import com.it.service.BookingsService;


@RestController
@RequestMapping("/v1/Bookings")
public class BookingsController {
	@Autowired
	private BookingsService bookingsService;
	private Integer bkId;
	
	
	@GetMapping
	public ResponseEntity<Object> getBookingsAll() {
		return ResponseEntity.ok(bookingsService.findBookingsByBkId(bkId));

}
	
	@GetMapping("/{bkId}")
	public ResponseEntity<Object> getBookingsByBkId(@PathVariable(name = "bkId")Integer bkId) {
		return ResponseEntity.ok(bookingsService.findBookingsByBkId(bkId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveBookings(@RequestBody BookingsDto bookingsDto) {
		return ResponseEntity.ok(bookingsService.saveBookings(bookingsDto));
	}
	@PutMapping("/{bkId}")
	public ResponseEntity<Object> updateBookings(
			@PathVariable(name = "bkId") Integer bkId,
			@RequestBody BookingsDto bookingsDto) {
		return ResponseEntity.ok(bookingsService.updateBookings(bkId, bookingsDto));
	}
	
	@DeleteMapping("/{bkId}")
	public ResponseEntity<Object> deleteBookingsByBkId(@PathVariable(name = "bkId") Integer bkId){
	return ResponseEntity.ok(bookingsService.deleteBookingsByBkId(bkId));
}

}
