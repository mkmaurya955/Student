package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mappers.StudentMapper;
import com.example.demo.dto.StudentDto;
import com.example.demo.studentdao.StudentDao;
import com.example.demo.vo.StudentVo;

@Service
public class ServiceImp implements ServiceInter {

	@Autowired	
	private StudentDao studentDao;
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public String insertDetails(StudentVo studentVo) {

		StudentDto studentDto = new StudentDto();
		studentDto = studentMapper.convertVoToDto(studentVo);
//		studentDto.setCreatedDate(LocalDate.now());
		studentDao.save(studentDto);
		return "DATA SAVED SUCCESFULLY";
	}
	
	@Override
	public void geDetails(StudentDto studentdto) {
		
		StudentVo studentvo=new StudentVo();
		studentvo =studentMapper.convertDtoToVo(studentdto);
		studentDao.findById(studentdto);
	}
	
	


	@Override
	public List<StudentVo> getAllStudentFname(String fName) {
		 List<StudentVo> studentVoList=new ArrayList<StudentVo>();
		 try {
		 List<StudentDto> StudentDtoList=studentDao.findByfName(fName);
		 studentVoList=studentMapper.convertDtoToVoList(StudentDtoList);
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return studentVoList;
	}
	@Override
	public String insertAllStudents(List<StudentVo> studentvo){
		 List<StudentDto> studentDtoList=new ArrayList<StudentDto>();
		 studentDtoList=studentMapper.convertVoToDtoList(studentvo);
		 studentDao.saveAll(studentDtoList);
		
		 
		 return "datasaved" ;
	}

	public String Delete(String fName)
	
	
	{
		return "deleted";
	}



}













































































































































































































































































