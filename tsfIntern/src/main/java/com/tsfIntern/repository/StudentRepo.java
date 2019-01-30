package com.tsfIntern.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsfIntern.StudentModel.StudentModel;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Long> {

	
	
}
