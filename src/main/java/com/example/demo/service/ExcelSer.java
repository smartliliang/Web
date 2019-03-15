package com.example.demo.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

/**
 * Created by ASUS on 2019/1/10.
 */
public interface ExcelSer {
     void importExcelInfo(InputStream in, MultipartFile file) throws Exception;
}
