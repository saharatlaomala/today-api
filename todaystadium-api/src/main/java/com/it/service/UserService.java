package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.UserDto;
import com.it.entity.UserEntity;
import com.it.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private UserRepository userRepository ;
	
	public List<UserDto> findUserAll() {
		List<UserEntity>userEntities = userRepository.findAll() ;
	   return modelMapper.map(userEntities, new TypeToken<List<UserDto>>() {}.getType());
	    
		
	}
	
	public UserDto findUserByUserId(Integer userId) {
		Optional<UserEntity> userOtn = userRepository.findById(userId);
		if (userOtn.isPresent()) {
			return modelMapper.map(userOtn.get(), new TypeToken<UserDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean saveUser(UserDto userDto) {
		boolean saveFig = false;
		try {
			UserEntity entity = modelMapper.map(userDto,UserEntity.class);	
			userRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateUserByUserId(Integer userId,UserDto userDto) {
		boolean updateFig = false;
		try {
			//
			Optional<UserEntity> userOtn = userRepository.findById(userId);
			if(userOtn.isPresent()) {
				UserEntity entity = modelMapper.map(userDto,UserEntity.class);	
				userRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteUserByUserId(Integer userId) {
		boolean deleteFig = false;
		try {
				userRepository.deleteById(userId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}


