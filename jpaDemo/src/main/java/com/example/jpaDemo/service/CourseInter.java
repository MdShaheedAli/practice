package com.example.jpaDemo.service;

import com.example.jpaDemo.dao.Course;

public interface CourseInter {

	String saveCourse(Course course);

	String getAllCourse();

	String associateTeacherWithCourse(String data);

	String associateStudentWithCourse(String data);

	String getCourseByTeacher(String name);






}
