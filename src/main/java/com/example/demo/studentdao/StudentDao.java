package com.example.demo.studentdao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.StudentDto;
import java.lang.String;

@Repository
public interface StudentDao extends MongoRepository<StudentDto,Serializable> {

	
public List<StudentDto> findByfName(String fName);
//public List<StudentDto>findByFName(String fName);
public List<StudentDto> findBylName(String lname);


}
