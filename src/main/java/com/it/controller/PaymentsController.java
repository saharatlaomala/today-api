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
	private  PaymentsService  paymentsService;
	private Integer pmpaymentId;
	
	
	@GetMapping
	public ResponseEntity<Object> getPaymentsAll() {
		return ResponseEntity.ok( paymentsService.findPaymentsByPmpaymentId(pmpaymentId));

}
	
	@GetMapping("/{pmpaymentId}")
	public ResponseEntity<Object> getPaymentsByPmpaymentId(@PathVariable(name = "pmpaymentId")Integer pmpaymentId) {
		return ResponseEntity.ok(paymentsService.findPaymentsByPmpaymentId(pmpaymentId));
	}
	
	@PostMapping
	public ResponseEntity<Object> savePayments(@RequestBody PaymentsDto paymentsDto) {
		return ResponseEntity.ok(paymentsService.savePayments(paymentsDto));
	}
	@PutMapping("/{pmpaymentId}")
	public ResponseEntity<Object> updatePayments(
			@PathVariable(name = "pmpaymentId") Integer pmpaymentId,
			@RequestBody PaymentsDto paymentsDto) {
		return ResponseEntity.ok(paymentsService.updatePayments(pmpaymentId, paymentsDto));
	}
	
	@DeleteMapping("/{pmpaymentId}")
	public ResponseEntity<Object> deletePaymentsByPmpaymentId(@PathVariable(name = "pmpaymentId") Integer pmpaymentId){
	return ResponseEntity.ok(paymentsService.deletePaymentsByPmpaymentId(pmpaymentId));
}

}
