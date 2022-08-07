package com.it.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.it.entity.UserdetailEntity;

@Repository
public interface UserdetailRepository extends JpaRepository<UserdetailEntity, Integer>{

}
