package com.vnnogile.studentapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnnogile.studentapi.module.StudentDetailsModule;
import com.vnnogile.studentapi.repository.StudentDetailsRepository;

@Service
public class StudentDetailsService {
	
	@Autowired
	StudentDetailsRepository studentDetailsRepository;

	public StudentDetailsModule saveStudentDetails(StudentDetailsModule studentDetailsModule) {
	
		return studentDetailsRepository.save(studentDetailsModule);
	}

	public List<StudentDetailsModule> getStudentDetails() {
		
		return (List<StudentDetailsModule>) studentDetailsRepository.findAll();
	}

}
