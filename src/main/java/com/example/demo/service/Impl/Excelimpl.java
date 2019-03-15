package com.example.demo.service.Impl;

import com.example.demo.bean.Excel;
import com.example.demo.mapper.ExcelMapper;
import com.example.demo.service.ExcelSer;
import com.example.demo.util.ExcelUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2019/1/10.
 */
@Service
public class Excelimpl implements ExcelSer {

    @Resource
    private ExcelMapper excelMapper;

    @Override
    public void importExcelInfo(InputStream in, MultipartFile file) throws Exception {
        System.out.print("实现类");
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());
        List<Excel> list = new ArrayList<Excel>();
        //遍历listob数据，把数据放到List中
        for (int i = 0; i < listob.size(); i++) {
            List<Object> ob = listob.get(i+1);
            Excel excel=new Excel();
            excel.setName(ob.get(1).toString());
            excel.setSex(ob.get(2).toString());
            /*//设置编号
            salarymanage.setSerial(SerialUtil.salarySerial());*/
            //通过遍历实现把每一列封装成一个model中，再把所有的model用List集合装载
           /* carousel.setCarTime(df.parse(ob.get(3).toString()));*/
           /* carousel.setCarLocal((short) Integer.parseInt(ob.get(4).toString()));
            carouselMapper.insertOBJ(carousel);*/
            list.add(excel);
        }
        //批量插入
        excelMapper.insertExcel(list);

    }
}
