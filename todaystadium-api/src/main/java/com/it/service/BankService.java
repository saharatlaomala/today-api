package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.BankDto;
import com.it.entity.BankEntity;
import com.it.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private BankRepository bankRepository ;
	
	public List<BankDto> findBankAll() {
		List<BankEntity>bankEntities = bankRepository.findAll();
	   return modelMapper.map(bankEntities, new TypeToken<List<BankDto>>() {}.getType());
	    
		
	}
	
	public BankDto findBankByBankId(Integer bankId) {
		Optional<BankEntity> bankOtn = bankRepository.findById(bankId);
		if (bankOtn.isPresent()) {
			return modelMapper.map(bankOtn.get(), new TypeToken<BankDto>() {}.getType());
		}
		
	
		return null;
	 }
	
	public boolean saveBank(BankDto bankDto) {
		boolean saveFig = false;
		try {
			BankEntity entity = modelMapper.map(bankDto,BankEntity.class);	
			bankRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updateBankByBankId(Integer bankId,BankDto bankDto) {
		boolean updateFig = false;
		try {
			//
			Optional<BankEntity> bankOtn = bankRepository.findById(bankId);
			if(bankOtn.isPresent()) {
				BankEntity entity = modelMapper.map(bankDto,BankEntity.class);	
				bankRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deleteBankByBankId(Integer bankId) {
		boolean deleteFig = false;
		try {
				bankRepository.deleteById(bankId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}



