package com.godfrey.dto;

import lombok.Data;

import java.sql.Date;

/**
 * description : EmployeeDTO
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Data
public class EmployeeDTO {
    private Integer id;
    private String employeeName;
    private String email;
    private Integer gender;
    private String departmentName;
    private Date date;
}