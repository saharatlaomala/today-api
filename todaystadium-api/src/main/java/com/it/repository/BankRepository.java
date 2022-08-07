package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.BankEntity;

@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer>{

}
