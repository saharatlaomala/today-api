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

import com.it.dto.UserDto;
import com.it.service.UserService;

@RestController
@RequestMapping("/v1/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	
	@GetMapping
	public ResponseEntity<Object> getUserAll() {
		return ResponseEntity.ok(userService.findUserAll());

}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Object> getUserByUserId(@PathVariable(name = "userId")Integer userId) {
		return ResponseEntity.ok(userService.findUserByUserId(userId));
	}
	
	@PostMapping
	public ResponseEntity<Object> saveUser(@RequestBody UserDto userDto) {
		return ResponseEntity.ok(userService.saveUser(userDto));
	}
	@PutMapping("/{userId}")
	public ResponseEntity<Object> updateUser(
			@PathVariable(name = "userId") Integer userId,
			@RequestBody UserDto userDto) {
		return ResponseEntity.ok(userService.updateUserByUserId(userId, userDto));
	}
	
	@DeleteMapping("/{userId}") //
	public ResponseEntity<Object> deleteUserByUserId(@PathVariable(name = "userId") Integer userId){
	return ResponseEntity.ok(userService.deleteUserByUserId(userId));
}
	
}
