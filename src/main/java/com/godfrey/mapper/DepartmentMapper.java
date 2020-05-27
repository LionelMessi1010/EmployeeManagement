package com.godfrey.mapper;

import com.godfrey.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description : 部门Mapper
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Mapper
@Repository
public interface DepartmentMapper {

    List<Department> selectAllDepartment();
}
