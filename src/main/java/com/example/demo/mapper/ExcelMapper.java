package com.example.demo.mapper;

import com.example.demo.bean.Excel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ASUS on 2019/1/10.
 */
@Mapper
@Component(value = "excelMapper")
public interface ExcelMapper {
    void insertExcel(@Param(value = "list") List<Excel> list);
}
