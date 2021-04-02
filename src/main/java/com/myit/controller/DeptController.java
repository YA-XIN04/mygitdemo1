package com.myit.controller;

import com.myit.pojo.Dept;
import com.myit.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping(value = "/getDept")
    public String getDept(int id, Model model){
        Dept dept=null;
        try {
            dept=deptService.getDeptById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("dept",dept);
        return "viewDept";
    }
}
