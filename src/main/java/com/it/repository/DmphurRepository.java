package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.DmphurEntity;

@Repository
public interface DmphurRepository extends JpaRepository<DmphurEntity, Integer> {

}
