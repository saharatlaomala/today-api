package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.BookingsEntity;

@Repository
public interface BookingsRepository extends JpaRepository<BookingsEntity, Integer>{

}
