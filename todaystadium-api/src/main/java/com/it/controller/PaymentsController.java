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

import com.it.dto.PaymentsDto;
import com.it.service.PaymentsService;

@RestController
@RequestMapping("/v1/Payments")
public class PaymentsController {
	@Autowired
	private PaymentsService paymentsService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getPaymentsAll() {
		return ResponseEntity.ok(paymentsService.findPaymentsAll());

}
	
	@GetMapping("/{pmId}")
	public ResponseEntity<Object> getPaymentsByPmId(@PathVariable(name = "pmId")Integer pmId) {
		return ResponseEntity.ok(paymentsService.findPaymentsByPmId(pmId));
	}
	
	@PostMapping
	public ResponseEntity<Object> savePayments(@RequestBody PaymentsDto paymentsDto) {
		return ResponseEntity.ok(paymentsService.savePayments(paymentsDto));
	}
	@PutMapping("/{pmId}")
	public ResponseEntity<Object> updatePayments(
			@PathVariable(name = "pmId") Integer pmId,
			@RequestBody PaymentsDto paymentsDto) {
		return ResponseEntity.ok(paymentsService.updatePayments(pmId, paymentsDto));
	}
	
	@DeleteMapping("/{pmId}") //
	public ResponseEntity<Object> deletePaymentsByPmId(@PathVariable(name = "pmId") Integer pmId){
	return ResponseEntity.ok(paymentsService.deletePaymentsById(pmId));
}
	
}
