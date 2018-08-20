package com.medslama.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medslama.persistence.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
