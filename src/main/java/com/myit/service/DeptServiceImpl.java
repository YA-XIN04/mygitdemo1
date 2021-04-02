package com.myit.service;

import com.myit.dao.DeptMapper;
import com.myit.pojo.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service(value = "deptService")
@Transactional
public class DeptServiceImpl implements DeptService{
    @Resource
    private DeptMapper deptMapper;

    @Override
    public Dept getDeptById(int id) throws Exception {
        return deptMapper.findById(id);
    }
}
