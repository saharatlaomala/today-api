package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.BookingsDto;
import com.it.entity.BookingsEntity;
import com.it.repository.BookingsRepository;

@Service
public class BookingsService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private BookingsRepository bookingsRepository;
	
	public List<BookingsDto> findBookingsAll() {
		List<BookingsEntity> bookingsEntities =  bookingsRepository.findAll();
		return modelMapper.map(bookingsEntities, new TypeToken<List<BookingsDto>>() {}.getType());
	}
	
	
	public BookingsDto findBookingsByBkId(Integer bkId) {
		Optional<BookingsEntity> bookingsOtn =  bookingsRepository.findById(bkId);
		if (bookingsOtn.isPresent()) {
			return modelMapper.map(bookingsOtn, new TypeToken<List<BookingsDto>>() {}.getType());
		}
		return null;
	}
	
	
	public boolean saveBookings(BookingsDto bookingsDto) {
		boolean saveFlg = false;
		try {
			BookingsEntity entity = modelMapper.map(bookingsDto, BookingsEntity.class);
			bookingsRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return saveFlg;
	}
	
	public boolean updateBookings(Integer bkId,BookingsDto bookingsDto) {
		boolean updateFlg = false;
		try {	
			Optional<BookingsEntity> bookingsOtn = bookingsRepository.findById(bkId);
			if (bookingsOtn.isPresent()) {
				BookingsEntity entity = modelMapper.map(bookingsDto, BookingsEntity.class);
				bookingsRepository.save(entity);
				updateFlg = true;
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}				
		return updateFlg;
	}
	
	public boolean deleteBookingsByBkId(Integer bkId) {
		boolean deleteFig = false;
		try {
			bookingsRepository.deleteById(bkId);
			deleteFig = true;
		} catch (Exception e){
			e.printStackTrace();
		}
		return deleteFig;
	}

}
