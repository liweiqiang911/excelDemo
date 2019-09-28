package com.example.exceldemo.service.impl;

import com.example.exceldemo.entity.OaLeave;
import com.example.exceldemo.mapper.DemoMapper;
import com.example.exceldemo.service.DemoService;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    public List<OaLeave> getAllLeaveByEmpId(Integer empId){
        List<OaLeave> result = demoMapper.findAllLeaveByEmpId(empId);
        return result;
    }

    /**
     * 从数据库中导出excel数据
     * @return
     * @throws Exception
     */
    @Override
    public byte[] createExcel() throws Exception{
        List<OaLeave> result = getAllLeaveByEmpId(8);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("请假表");
        XSSFCellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);
        sheet.setColumnWidth(0, 10 * 256);
        sheet.setColumnWidth(1, 15 * 256);
        sheet.setColumnWidth(2, 20 * 256);
        sheet.setColumnWidth(3, 30 * 256);
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = null;
        for (int j = 0; j < 4; j++) {
            cell = row.createCell(j);
            cell.setCellStyle(style);
        }
        sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 3));
        row.getCell(0).setCellValue("员工请假单");
        for (int i = 0 ; i<result.size() ; i++) {
            OaLeave oaLeave = result.get(i);
            List<String> list = new ArrayList<>();
            list.add(oaLeave.getDeeply());
            list.add(oaLeave.getEmpName());
            list.add(oaLeave.getTitle());
            list.add(oaLeave.getReason());
            row = sheet.createRow(i+1);
            for (int j = 0; j < list.size(); j++) {
                cell = row.createCell(j);
                cell.setCellStyle(style);
                cell.setCellValue(list.get(j));
            }
        }

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        //将Excel写到流中
        workbook.write(out);
        workbook.close();
        out.close();
        //从流中获取全部Excel的数据
        byte[] bytes=out.toByteArray();
        return bytes;
    }

    

}
