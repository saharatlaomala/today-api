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
	private ModelMapper modelMapper ;
	
	@Autowired
	private UserdetailRepository userdetailRepository ;
	
	public List<UserdetailDto> findUserdetailAll() {
		List<UserdetailEntity>userdetailEntities = userdetailRepository.findAll() ;
	   return modelMapper.map(userdetailEntities, new TypeToken<List<UserdetailDto>>() {}.getType());
	    
		
	}
	
	public UserdetailDto findUserdetailByUserdtId(Integer userdtId) {
		Optional<UserdetailEntity> userdtOtn = userdetailRepository.findById(userdtId);
		if (userdtOtn.isPresent()) {
			return modelMapper.map(userdtOtn.get(), new TypeToken<UserdetailDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean saveUserdetail(UserdetailDto userdetailDto) {
		boolean saveFig = false;
		try {
			UserdetailEntity entity = modelMapper.map(userdetailDto,UserdetailEntity.class);	
			userdetailRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateUserdetailByUserdtId(Integer userdtId,UserdetailDto userdetailDto) {
		boolean updateFig = false;
		try {
			//
			Optional<UserdetailEntity> userdtOtn = userdetailRepository.findById(userdtId);
			if(userdtOtn.isPresent()) {
				UserdetailEntity entity = modelMapper.map(userdetailDto,UserdetailEntity.class);	
				userdetailRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteUserdetailByUserdtId(Integer userdtId) {
		boolean deleteFig = false;
		try {
				userdetailRepository.deleteById(userdtId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}

