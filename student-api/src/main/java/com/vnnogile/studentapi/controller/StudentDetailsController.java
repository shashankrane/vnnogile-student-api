package com.vnnogile.studentapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnnogile.studentapi.module.StudentDetailsModule;
import com.vnnogile.studentapi.service.StudentDetailsService;

@RestController
@RequestMapping("/vnnogile")
public class StudentDetailsController {
	
	@Autowired
	StudentDetailsService studentDetailsService;
	
	@PostMapping("/save_studentsDetails")
	public StudentDetailsModule saveStudentDetails(@RequestBody StudentDetailsModule studentDetailsModule) {
		StudentDetailsModule student = studentDetailsService.saveStudentDetails(studentDetailsModule);
		return student;
	}
	
	@GetMapping("/get_allStudentDetails")
	public List<StudentDetailsModule>  getStudentDetails() {
		List<StudentDetailsModule> student= studentDetailsService.getStudentDetails();
		return student;
	}
}
