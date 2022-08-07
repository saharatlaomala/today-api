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

import com.it.dto.BankDto;
import com.it.service.BankService;


@RestController
@RequestMapping("/v1/Bank")
public class BankController {
	@Autowired
	private BankService bankService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getBankAll() {
		return ResponseEntity.ok(bankService.findBankAll());

}
	
	@GetMapping("/{bankId}")
	public ResponseEntity<Object> getBankByBankId(@PathVariable(name = "bankId")Integer bankId) {
		return ResponseEntity.ok(bankService.findBankByBankId(bankId));
	}
	
	@PostMapping
	public ResponseEntity<Object> bankRole(@RequestBody BankDto bankDto) {
		return ResponseEntity.ok(bankService.saveBank(bankDto));
	}
	@PutMapping("/{bankId}")
	public ResponseEntity<Object> updateBank(
			@PathVariable(name = "bankId") Integer bankId,
			@RequestBody BankDto bankDto) {
		return ResponseEntity.ok(bankService.updateBankByBankId(bankId, bankDto));
	}
	
	@DeleteMapping("/{bankId}") //
	public ResponseEntity<Object> deleteBankByBankId(@PathVariable(name = "bankId") Integer bankId){
	return ResponseEntity.ok(bankService.deleteBankByBankId(bankId));
}
	
}

