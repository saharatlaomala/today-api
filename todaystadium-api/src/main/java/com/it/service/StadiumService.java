package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.StadiumDto;
import com.it.entity.StadiumEntity;
import com.it.repository.StadiumRepository;

@Service
public class StadiumService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private StadiumRepository stadiumRepository ;
	
	public List<StadiumDto> findStadiumAll() {
		List<StadiumEntity>stadiumEntities = stadiumRepository.findAll() ;
	   return modelMapper.map(stadiumEntities, new TypeToken<List<StadiumDto>>() {}.getType());
	    
		
	}
	
	public StadiumDto findStadiumByStdmId(Integer stdmId) {
		Optional<StadiumEntity> stdmOtn = stadiumRepository.findById(stdmId);
		if (stdmOtn.isPresent()) {
			return modelMapper.map(stdmOtn.get(), new TypeToken<StadiumDto>() {}.getType());
		}
		
		return null;
	}
	
	public boolean saveStadium(StadiumDto stadiumDto) {
		boolean saveFlg = false;
		try {
			StadiumEntity entity = modelMapper.map(stadiumDto, StadiumEntity.class);
			stadiumRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFlg;
	}
	
	public boolean updateStadium(Integer stdmId, StadiumDto stadiumDto) {
        boolean updateFlg  = false;
        try {
            Optional<StadiumEntity> stdmOtn = stadiumRepository.findById(stdmId);
            if ( stdmOtn.isPresent()) {
                StadiumEntity entity = modelMapper.map(stadiumDto, StadiumEntity.class);
                stadiumRepository.save(entity);
                updateFlg = true;

            }
        } catch(Exception e) {

        }
        return updateFlg;

    }

	
	public boolean deletStadiumById(Integer stdmId) {
		boolean deleteFlg = false;
		try {
			stadiumRepository.deleteById(stdmId);
			deleteFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFlg;
	}
	
	

}
