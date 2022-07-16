package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.ProviceDto;
import com.it.entity.ProvinceEntity;
import com.it.repository.ProvinceRepository;


@Service
public class ProvinceService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private ProvinceRepository provinceRepository;
	
	public List<ProviceDto> findProvinceAll() {
		List<ProvinceEntity> provinceEntities =  provinceRepository.findAll();
		return modelMapper.map(provinceEntities, new TypeToken<List<ProviceDto>>() {}.getType());
	}
	
	
	public ProviceDto findProviceByPvnId(Integer pvnId) {
		Optional<ProvinceEntity> provinceOtn =  provinceRepository.findById(pvnId);
		if (provinceOtn.isPresent()) {
			return modelMapper.map(provinceOtn, new TypeToken<List<ProviceDto>>() {}.getType());
						
		}
		return null;
	}
	
	
	public boolean saveProvince(ProviceDto proviceDto) {
		boolean saveFlg = false;
		try {
			ProvinceEntity entity = modelMapper.map(proviceDto, ProvinceEntity.class);
			provinceRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updateProvince(Integer pvnId,ProviceDto proviceDto) {
		boolean updateFlg = false;
		try {	
			Optional<ProvinceEntity> provinceOtn = provinceRepository.findById(pvnId);
			if (provinceOtn.isPresent()) {
				ProvinceEntity entity = modelMapper.map(proviceDto, ProvinceEntity.class);
				provinceRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deleteProvinceByPvnId(Integer pvnId) {
		boolean deleteFig = false;
		try {
			provinceRepository.deleteById(pvnId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}

}
