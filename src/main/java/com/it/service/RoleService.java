package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.RoleDto;
import com.it.entity.RoleEntity;
import com.it.repository.RoleRepository;

@Service
public class RoleService {
	
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private RoleRepository roleRepository ;
	
	public List<RoleDto> findRoleAll() {
		List<RoleEntity>roleEntities = roleRepository.findAll() ;
	   return modelMapper.map(roleEntities, new TypeToken<List<RoleDto>>() {}.getType());
	    
		
	}
	
	public RoleDto findRoleByRoleId(Integer roleId) {
		Optional<RoleEntity> roleOtn = roleRepository.findById(roleId);
		if (roleOtn.isPresent()) {
			RoleDto dto = new RoleDto();
			dto.setRoleId(roleOtn.get().getRoleId());
			dto.setRoleName(roleOtn.get().getRoleName());
			dto.setRoleDes(roleOtn.get().getRoleDes());
			dto.setRoleStatus(roleOtn.get().getRoleStatus());
			// do...
			return dto;
		}
		
		return null;
	 }
	
	public boolean saveRole(RoleDto roleDto) {
		boolean saveFig = false;
		try {
			RoleEntity entity = modelMapper.map(roleDto,RoleEntity.class);	
			roleRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateRole(Integer roleId,RoleDto roleDto) {
		boolean updateFig = false;
		try {
			//
			Optional<RoleEntity> roleOtn = roleRepository.findById(roleId);
			if(roleOtn.isPresent()) {
				RoleEntity entity = modelMapper.map(roleDto,RoleEntity.class);	
				roleRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteRoleByRoleId(Integer roleId) {
		boolean deleteFig = false;
		try {
				roleRepository.findById(roleId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}
