package com.godfrey.pojo;

import lombok.Data;

/**
 * description : 登录验证实体类
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
}
