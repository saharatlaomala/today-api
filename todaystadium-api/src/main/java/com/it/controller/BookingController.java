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

import com.it.dto.BookingDto;
import com.it.service.BookingService;

@RestController
@RequestMapping("/v1/Booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getBookingAll() {
		return ResponseEntity.ok(bookingService.findBookingAll());

}
	
	@GetMapping("/{bkId}")
	public ResponseEntity<Object> getBookingBybkId(@PathVariable(name = "bkId")Integer bkId) {
		return ResponseEntity.ok(bookingService.findBookingByBkId(bkId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveBooking(@RequestBody BookingDto bookingDto) {
		return ResponseEntity.ok(bookingService.saveBooking(bookingDto));
	}
	@PutMapping("/{bkId}")
	public ResponseEntity<Object> updateBooking(
			@PathVariable(name = "bkId") Integer bkId,
			@RequestBody BookingDto bookingDto) {
		return ResponseEntity.ok(bookingService.updateBooking(bkId, bookingDto));
	}
	
	@DeleteMapping("/{bkId}") //
	public ResponseEntity<Object> deleteBookingByBkId(@PathVariable(name = "bkId") Integer bkId){
	return ResponseEntity.ok(bookingService.deletBookingById(bkId));
}
	
}



