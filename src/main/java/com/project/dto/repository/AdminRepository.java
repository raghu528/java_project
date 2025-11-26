package com.project.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Admin;

public interface AdminRepository  extends JpaRepository<Admin,Integer>{

}
