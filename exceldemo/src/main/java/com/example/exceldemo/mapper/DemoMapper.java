package com.example.exceldemo.mapper;

import com.example.exceldemo.entity.OaLeave;

import java.util.List;

public interface DemoMapper {
    List<OaLeave> findAllLeaveByEmpId(Integer empId);
}
