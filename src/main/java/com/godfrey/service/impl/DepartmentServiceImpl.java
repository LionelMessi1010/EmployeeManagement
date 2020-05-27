package com.godfrey.service.impl;

/**
 * description : DepartmentServiceImpl
 *
 * @author godfrey
 * @since 2020-05-27
 */

import com.godfrey.mapper.DepartmentMapper;
import com.godfrey.pojo.Department;
import com.godfrey.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> selectAllDepartment() {
        return departmentMapper.selectAllDepartment();
    }

}