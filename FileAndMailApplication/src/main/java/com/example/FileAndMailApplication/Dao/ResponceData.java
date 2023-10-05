package com.example.FileAndMailApplication.Dao;

import lombok.Data;

@Data
public class ResponceData {

	String fileName;
	String fileType;
	Long fileSize;
	String downloadUrl;
}
