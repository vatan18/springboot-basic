package com.student.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
	
	private List<Students>students=new ArrayList<>(Arrays.asList(
        new Students("95","Biswajit","Electrical"),
        new Students("96","Siva","Electronics"),
        new Students("97","Vatan","EEE")
			));
	public List<Students>getStudent(){
		return students;
	}
	public Students getStudent(String id) {
		return students.stream().filter(s->s.getId().equals(id)).findFirst().get();
	}
	public void addStudent(Students student) {
		students.add(student);
	}
	public void updateStudent(String id,Students student) {
		for(int i=0;i<students.size();i++) {
			Students s=students.get(i);
			if(s.getId().equals(id)) {
				students.set(i, student);
				return;
			}
		}
	}
	public void deleteStudent(String id) {
		students.removeIf(s->s.getId().equals(id));
	}

}
