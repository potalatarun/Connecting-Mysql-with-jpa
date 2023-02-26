package com.example.PractiseJPAWITHMYSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.PractiseJPAWITHMYSQL.entitymodel.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
}
