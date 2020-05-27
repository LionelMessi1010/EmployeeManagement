package com.godfrey.pojo;

import lombok.Data;

import java.sql.Date;

/**
 * description : 员工实体类
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Data
public class Employee {
    private Integer id;
    private String employeeName;
    private String email;
    private Integer gender; //0:女  1:男
    private Date date;
    private Integer departmentId;
}
