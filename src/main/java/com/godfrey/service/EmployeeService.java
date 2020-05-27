package com.godfrey.service;

import com.godfrey.dto.EmployeeDTO;
import com.godfrey.pojo.Employee;

import java.util.List;

/**
 * description : 员工业务层接口
 *
 * @author godfrey
 * @since 2020-05-26
 */
public interface EmployeeService {
    //查询全部员工信息
    List<EmployeeDTO> selectAllEmployeeDTO();
    //根据id查询员工信息
    Employee selectEmployeeById(int id);
    //添加一个员工信息
    int addEmployee(Employee employee);
    //修改一个员工信息
    int updateEmployee(Employee employee);
    //根据id删除员工信息
    int deleteEmployee(int id);
}
