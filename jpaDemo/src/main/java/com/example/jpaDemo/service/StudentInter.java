package com.example.jpaDemo.service;

import com.example.jpaDemo.dao.Student;

public interface StudentInter {

	String getAllStudents();

	String saveStudents(String student);

	String saveStudents(int id);

}
