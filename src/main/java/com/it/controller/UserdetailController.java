package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	private Integer userId;
	
	
	@GetMapping
	public ResponseEntity<Object> getUserdetailAll() {
		return ResponseEntity.ok(userdetailService.findUserdetailByUserId(userId));

}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Object> getUserdetailByUserId(@PathVariable(name = "userId")Integer userId) {
		return ResponseEntity.ok(userdetailService.findUserdetailByUserId(userId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveUserdetail(@RequestBody UserdetailDto userdetailDto) {
		return ResponseEntity.ok(userdetailService.saveUserdetail(userdetailDto));
	}
	@PutMapping("/{userId}")
	public ResponseEntity<Object> updateUserdetail(
			@PathVariable(name = "userId") Integer userId,
			@RequestBody UserdetailDto userdetailDto) {
		return ResponseEntity.ok(userdetailService.updateUserdetail(userId, userdetailDto));
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

}


