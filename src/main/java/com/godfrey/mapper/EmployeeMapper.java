package com.godfrey.mapper;

import com.godfrey.dto.EmployeeDTO;
import com.godfrey.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description : 员工Mapper
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Mapper
@Repository
public interface EmployeeMapper {
    //查询全部员工信息
    List<EmployeeDTO> selectAllEmployeeDTO();

    //根据id查询员工信息
    Employee selectEmployeeById(@Param("id") Integer id);

    //添加一个员工信息
    int addEmployee(Employee employee);

    //修改一个员工信息
    int updateEmployee(Employee employee);

    //根据id删除员工信息
    int deleteEmployee(@Param("id") Integer id);
}
