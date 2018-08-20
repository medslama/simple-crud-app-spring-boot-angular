package com.medslama.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medslama.persistence.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Integer>{

}
