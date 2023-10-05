package com.example.FileAndMailApplication.Service;

import org.springframework.web.multipart.MultipartFile;

import com.example.FileAndMailApplication.Dao.Attachments;
import com.example.FileAndMailApplication.Dao.ResponceData;

public interface HandleFileInter {

	ResponceData saveFile(MultipartFile file);

	Attachments downloadFile(Integer fileId);

}
