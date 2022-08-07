package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.StadiumEntity;

@Repository
public interface StadiumRepository extends JpaRepository<StadiumEntity, Integer>{

}
