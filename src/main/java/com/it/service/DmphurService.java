package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.DmphurDto;
import com.it.entity.DmphurEntity;
import com.it.repository.DmphurRepository;

@Service
public class DmphurService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private DmphurRepository dmphurRepository;
	
	public List<DmphurDto> findProvinceAll() {
		List<DmphurEntity> dmphurEntities =  dmphurRepository.findAll();
		return modelMapper.map(dmphurEntities, new TypeToken<List<DmphurDto>>() {}.getType());
	}
	
	
	public DmphurDto findDmphurBydisId(Integer disId) {
		Optional<DmphurEntity> dmphurOtn =  dmphurRepository.findById(disId);
		if (dmphurOtn.isPresent()) {
			return modelMapper.map(dmphurOtn, new TypeToken<List<DmphurDto>>() {}.getType());

		}
		return null;
	}
	
	
	public boolean saveDmphur(DmphurDto dmphurDto) {
		boolean saveFlg = false;
		try {
			DmphurEntity entity = modelMapper.map(dmphurDto, DmphurEntity.class);
			dmphurRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updateDmphur(Integer disId,DmphurDto dmphurDto) {
		boolean updateFlg = false;
		try {	
			Optional<DmphurEntity> dmphurOtn = dmphurRepository.findById(disId);
			if (dmphurOtn.isPresent()) {
				DmphurEntity entity = modelMapper.map(dmphurDto, DmphurEntity.class);
				dmphurRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deleteDmphurByDisId(Integer disId) {
		boolean deleteFig = false;
		try {
			dmphurRepository.deleteById(disId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}

}
