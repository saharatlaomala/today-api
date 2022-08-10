package com.it.controller;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.dto.AuthenDto;
import com.it.entity.UserdetailEntity;
import com.it.repository.UserdetailRepository;
import com.it.utils.PasswordEncryptorUtils;

@RequestMapping("/authentication")
@RestController
public class AuthenController {

	@Autowired
	private UserdetailRepository userdetailRepository;

	@PostMapping("/login")
	public ResponseEntity<UserdetailEntity> loginByUsernamePassword(@RequestBody AuthenDto request) {
		UserdetailEntity entity = userdetailRepository.findByUserdtUsername(request.getUsername());
		if (ObjectUtils.isNotEmpty(entity) && PasswordEncryptorUtils.checkPassword(request.getPassword(), entity.getUserdtPassword())) {
			return ResponseEntity.ok(entity);
		} else {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
	}

}