package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.PaymentsDto;
import com.it.entity.PaymentsEntity;
import com.it.repository.PaymentsRepository;


@Service
public class PaymentsService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private PaymentsRepository paymentsRepository ;
	
	public List<PaymentsDto> findPaymentsAll() {
		List<PaymentsEntity>paymenEntities = paymentsRepository.findAll() ;
	   return modelMapper.map(paymenEntities, new TypeToken<List<PaymentsDto>>() {}.getType());
	    
		
	}
	
	public PaymentsDto findPaymentsByPmId(Integer pmId) {
		Optional<PaymentsEntity> paymentsOtn = paymentsRepository.findById(pmId);
		if (paymentsOtn.isPresent()) {
			return modelMapper.map(paymentsOtn.get(), new TypeToken<PaymentsDto>() {}.getType());
		}
		
		return null;
	 }
	
	public boolean savePayments(PaymentsDto paymentsDto) {
		boolean saveFig = false;
		try {
			PaymentsEntity entity = modelMapper.map(paymentsDto,PaymentsEntity.class);	
			paymentsRepository.save(entity);
			saveFig = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFig;
	}
	
	public boolean updatePayments(Integer pmId,PaymentsDto paymentsDto) {
		boolean updateFig = false;
		try {
			
			Optional<PaymentsEntity> paymentsOtn = paymentsRepository.findById(pmId);
			if(paymentsOtn.isPresent()) {
				PaymentsEntity entity = modelMapper.map(paymentsDto,PaymentsEntity.class);	
				paymentsRepository.save(entity);
				updateFig = true;
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateFig;
	}
	
	public boolean deletePaymentsById(Integer pmId) {
		boolean deleteFig = false;
		try {
				paymentsRepository.deleteById(pmId);
				deleteFig = true;								
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFig;
	}

	}
