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
	private ModelMapper modelMapper;

	@Autowired
	private PaymentsRepository paymentsRepository;
	
	public List<PaymentsDto> findProvinceAll() {
		List<PaymentsEntity> paymentsEntities =  paymentsRepository.findAll();
		return modelMapper.map(paymentsEntities, new TypeToken<List<PaymentsDto>>() {}.getType());
	}
	
	
	public PaymentsDto findPaymentsByPmpaymentId(Integer PmpaymentId) {
		Optional<PaymentsEntity> paymentsOtn =  paymentsRepository.findById(PmpaymentId);
		if (paymentsOtn.isPresent()) {
			return modelMapper.map(paymentsOtn, new TypeToken<List<PaymentsDto>>() {}.getType());
			
		}
		return null;
	}
	
	
	public boolean savePayments(PaymentsDto paymentsDto) {
		boolean saveFlg = false;
		try {
			PaymentsEntity entity = modelMapper.map(paymentsDto, PaymentsEntity.class);
			paymentsRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updatePayments(Integer PmpaymentId,PaymentsDto paymentsDto) {
		boolean updateFlg = false;
		try {	
			Optional<PaymentsEntity> paymentsOtn = paymentsRepository.findById(PmpaymentId);
			if (paymentsOtn.isPresent()) {
				PaymentsEntity entity = modelMapper.map(paymentsDto, PaymentsEntity.class);
				paymentsRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deletePaymentsByPmpaymentId(Integer PmpaymentId) {
		boolean deleteFig = false;
		try {
			paymentsRepository.deleteById(PmpaymentId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}

}
