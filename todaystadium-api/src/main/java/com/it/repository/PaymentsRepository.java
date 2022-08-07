package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.PaymentsEntity;

@Repository
public interface PaymentsRepository extends JpaRepository<PaymentsEntity, Integer>{

}
