package com.example.exceldemo.service;

import com.example.exceldemo.entity.OaLeave;

import java.util.List;

public interface DemoService {
    List<OaLeave> getAllLeaveByEmpId(Integer empId);

    byte[] createExcel() throws Exception;
}
