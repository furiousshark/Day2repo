package com.sppu.RepoInter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sppu.model.Student;

@Repository
public interface RepoInter extends JpaRepository<Student, Integer> {

	
	
}
