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

import com.it.dto.UserdetailDto;
import com.it.service.UserdetailService;

@RestController
@RequestMapping("/v1/Userdetail")
public class UserdetailController {
	
	@Autowired
	private UserdetailService userdetailService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getUserdetailAll() {
		return ResponseEntity.ok(userdetailService.findUserdetailAll());

}
	
	@GetMapping("/{userdtId}")
	public ResponseEntity<Object> getUserdetailByUserdtId(@PathVariable(name = "userdtId")Integer userdtId) {
		return ResponseEntity.ok(userdetailService.findUserdetailByUserdtId(userdtId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveUserdetail(@RequestBody UserdetailDto userdetailDto) {
		return ResponseEntity.ok(userdetailService.saveUserdetail(userdetailDto));
	}
	@PutMapping("/{userdtId}")
	public ResponseEntity<Object> updateUserdetail(
			@PathVariable(name = "userdtId") Integer userdtId,
			@RequestBody UserdetailDto userdetailDto) {
		return ResponseEntity.ok(userdetailService.updateUserdetailByUserdtId(userdtId, userdetailDto));
	}
	
	@DeleteMapping("/{userdtId}") //
	public ResponseEntity<Object> deleteUserdetailByUserdtId(@PathVariable(name = "userdtId") Integer userdtId){
	return ResponseEntity.ok(userdetailService.deleteUserdetailByUserdtId(userdtId));
}
	
}

