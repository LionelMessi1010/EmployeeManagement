package com.godfrey.service;

import com.godfrey.pojo.Department;

import java.util.List;

/**
 * description : DepartmentService
 *
 * @author godfrey
 * @since 2020-05-27
 */
public interface DepartmentService {
    List<Department> selectAllDepartment();
}
