package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServiceImp;
import com.example.demo.vo.StudentVo;

@CrossOrigin
@RestController

public class StudentController {

	@Autowired
	private ServiceImp studentService;

	@PostMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
	public String insertDetails(@RequestBody StudentVo studentVo) {
		String S;
		S = studentService.insertDetails(studentVo);

		return S;
	}

	@GetMapping(value = "/StudentDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public  List<StudentVo> getAllstudentFirstName(@RequestParam(value="firstName") String  fName) {
		 List<StudentVo> studentVoList=new ArrayList<StudentVo>();
		 studentVoList = studentService.getAllStudentFname(fName);
		 return studentVoList;
	}

	@PostMapping(value = "/insertall", produces = MediaType.APPLICATION_JSON_VALUE)
	public String insertall(@RequestBody List<StudentVo> studentvoList) {
		
		
		
		String S;
		S = studentService.insertAllStudents(studentvoList);

		return S;
	}









}



