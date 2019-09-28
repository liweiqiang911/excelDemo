package com.example.exceldemo.cotroller;

import com.example.exceldemo.entity.OaLeave;
import com.example.exceldemo.service.DemoService;
import com.example.exceldemo.service.impl.DemoServiceImpl;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/user")
public class DemoCotroller {

    @Autowired
    private DemoService service;

    /**
     * 将数据库中的请假信息显示到前端页面
     * @return
     */
    @GetMapping("/find")
    public List<OaLeave> getResult(){
        List<OaLeave> result = service.getAllLeaveByEmpId(8);
        return  result;
    }

    /**
     * 下载excel表单
     * @param response
     * @return
     * @throws Exception
     */
    @GetMapping("/change")
    public byte[] change(HttpServletResponse response) throws Exception{
        response.setHeader("Content-Disposition", "attachment; filename=\"demo.xlsx\"");
        byte[] bytes=service.createExcel();
        return bytes;
    }

    @GetMapping("/show_excel")
    public List<OaLeave> showExcel(){
        return null;
    }
}
