package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StudentDto;
import com.example.demo.vo.StudentVo;

public interface ServiceInter {
	public String insertDetails(StudentVo studentVo);
	public void geDetails(StudentDto studentdto);
	public List<StudentVo> getAllStudentFname(String fName);
	
	public String insertAllStudents(List<StudentVo> studentvo);
}
