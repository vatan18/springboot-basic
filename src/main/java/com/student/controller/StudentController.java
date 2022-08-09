package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Students>Student(){
		return studentService.getStudent();
	}
	
	@RequestMapping("/students/{id}")
	public Students getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(value="/students",method=RequestMethod.POST)
	public void addStudent(@RequestBody Students student) {
		studentService.addStudent(student);
	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.PUT)
	public void updateStudent(@RequestBody Students student,@PathVariable String id) {
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(value="/students/{id}",method=RequestMethod.DELETE)
	public void deleteStudent(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
