package com.example.jpaDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaDemo.dao.CourseMaterial;

public interface CourseMaterialRepo extends JpaRepository<CourseMaterial,Integer> {

}
