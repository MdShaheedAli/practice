package com.example.FileAndMailApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FileAndMailApplication.Dao.Attachments;

public interface AttachmentsRepo extends JpaRepository<Attachments, Integer> {

}
