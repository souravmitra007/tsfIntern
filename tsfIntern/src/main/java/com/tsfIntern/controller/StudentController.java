package com.tsfIntern.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsfIntern.StudentModel.StudentModel;
import com.tsfIntern.repository.StudentRepo;

@RestController
@RequestMapping("/")
public class StudentController {

  StudentModel stud;	
  
  @Autowired
  StudentRepo studrepo;
  
  @GetMapping("/students")
  public List<StudentModel> getAll(){
	  return studrepo.findAll();
  }
	
  @PostMapping("/addStud")
  public StudentModel getStud(@Valid @RequestBody StudentModel StudM) {
	  return studrepo.save(StudM);
  }
  
}
