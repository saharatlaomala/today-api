package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.SubdistrictDto;
import com.it.entity.SubdistrictEntity;
import com.it.repository.SubdistrictRepository;


@Service
public class SubdistrictService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private SubdistrictRepository subdistrictRepository;
	
	public List<SubdistrictDto> findSubdistrictAll() {
		List<SubdistrictEntity> subdistrictEntities =  subdistrictRepository.findAll();
		return modelMapper.map(subdistrictEntities, new TypeToken<List<SubdistrictDto>>() {}.getType());
	}
	
	
	public SubdistrictDto findSubdistrictBySdtId(Integer sdtId) {
		Optional<SubdistrictEntity> subdistrictOtn =  subdistrictRepository.findById(sdtId);
		if ( subdistrictOtn.isPresent()) {
		return modelMapper.map(subdistrictOtn, new TypeToken<List<SubdistrictDto>>() {}.getType());
		}
		return null;
	}
	
	
	public boolean saveSubdistrict(SubdistrictDto subdistrictDto) {
		boolean saveFlg = false;
		try {
			SubdistrictEntity entity = modelMapper.map(subdistrictDto, SubdistrictEntity.class);
			subdistrictRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updateSubdistrict(Integer sdtId,SubdistrictDto subdistrictDto) {
		boolean updateFlg = false;
		try {	
			Optional<SubdistrictEntity> subdistrictOtn = subdistrictRepository.findById(sdtId);
			if (subdistrictOtn.isPresent()) {
				SubdistrictEntity entity = modelMapper.map(subdistrictDto, SubdistrictEntity.class);
				subdistrictRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deleteSubdistrictBySdtId(Integer sdtId) {
		boolean deleteFig = false;
		try {
			subdistrictRepository.deleteById(sdtId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}

}
