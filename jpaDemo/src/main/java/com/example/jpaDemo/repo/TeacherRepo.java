package com.example.jpaDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaDemo.dao.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
