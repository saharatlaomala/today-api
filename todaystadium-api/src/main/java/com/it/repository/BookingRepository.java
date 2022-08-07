package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.BookingEntity;

@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer>{

}
