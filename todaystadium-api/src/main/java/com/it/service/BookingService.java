package com.it.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.dto.BookingDto;
import com.it.entity.BookingEntity;
import com.it.repository.BookingRepository;



@Service
public class BookingService {
	@Autowired
	private ModelMapper modelMapper ;
	
	@Autowired
	private BookingRepository bookingRepository ;
	
	public List<BookingDto> findBookingAll() {
		List<BookingEntity>bookingEntities = bookingRepository.findAll() ;
	   return modelMapper.map(bookingEntities, new TypeToken<List<BookingDto>>() {}.getType());
	    
		
	}
	
	public BookingDto findBookingByBkId(Integer bkId) {
		Optional<BookingEntity> bookingOtn = bookingRepository.findById(bkId);
		if (bookingOtn.isPresent()) {
			return modelMapper.map(bookingOtn.get(), new TypeToken<BookingDto>() {}.getType());
		}
		
		return null;
	}
	
	public boolean saveBooking(BookingDto bookingDto) {
		boolean saveFlg = false;
		try {
			BookingEntity entity = modelMapper.map(bookingDto, BookingEntity.class);
			bookingRepository.save(entity);
			saveFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return saveFlg;
	}
	
	public boolean updateBooking(Integer bkId, BookingDto bookingDto) {
        boolean updateFlg  = false;
        try {
            Optional<BookingEntity> bookingOtn = bookingRepository.findById(bkId);
            if ( bookingOtn.isPresent()) {
                BookingEntity entity = modelMapper.map(bookingDto, BookingEntity.class);
                bookingRepository.save(entity);
                updateFlg = true;

            }
        } catch(Exception e) {

        }
        return updateFlg;

    }

	
	public boolean deletBookingById(Integer bkId) {
		boolean deleteFlg = false;
		try {
			bookingRepository.deleteById(bkId);
			deleteFlg = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteFlg;
	}
	
	

}



