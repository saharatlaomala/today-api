package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.SubdistrictEntity;

@Repository
public interface SubdistrictRepository extends JpaRepository<SubdistrictEntity, Integer> {

}
