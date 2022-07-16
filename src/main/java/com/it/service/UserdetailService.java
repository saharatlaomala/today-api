package com.it.service;


import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.it.dto.UserdetailDto;
import com.it.entity.UserdetailEntity;
import com.it.repository.UserdetailRepository;

@Service
public class UserdetailService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserdetailRepository userdetailRepository;
	
	public List<UserdetailDto> findUserAll() {
		List<UserdetailEntity> userdetailEntities =  userdetailRepository.findAll();
		return modelMapper.map(userdetailEntities, new TypeToken<List<UserdetailDto>>() {}.getType());
	}
	
	
	public UserdetailDto findUserdetailByUserId(Integer userId) {
		Optional<UserdetailEntity> userdetailOtn =  userdetailRepository.findById(userId);
		if (userdetailOtn.isPresent()) {
			return modelMapper.map(userdetailOtn, new TypeToken<List<UserdetailDto>>() {}.getType());
				
		}
		return null;
	}
	
	
	public boolean saveUserdetail(UserdetailDto userdetailDto) {
		boolean saveFlg = false;
		try {
			UserdetailEntity entity = modelMapper.map(userdetailDto, UserdetailEntity.class);
			userdetailRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updateUserdetail(Integer userId,UserdetailDto userdetailDto) {
		boolean updateFlg = false;
		try {	
			Optional<UserdetailEntity> userdetailOtn = userdetailRepository.findById(userId);
			if (userdetailOtn.isPresent()) {
				UserdetailEntity entity = modelMapper.map(userdetailDto, UserdetailEntity.class);
				userdetailRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deleteUserdetailByUserId(Integer userId) {
		boolean deleteFig = false;
		try {
			userdetailRepository.deleteById(userId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}


}
