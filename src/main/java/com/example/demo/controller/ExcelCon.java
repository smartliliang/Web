package com.example.demo.controller;

import com.example.demo.service.ExcelSer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;

/**
 * Created by ASUS on 2019/1/10.
 */
@RestController
public class ExcelCon {
    @Resource
    private ExcelSer excelSer;

    @RequestMapping("/excel")
    public void importExcel(MultipartFile file) throws Exception {
        InputStream in = file.getInputStream();
        //数据导入
        System.out.print("controller");
        excelSer.importExcelInfo(in,file);
        in.close();
    }
}
