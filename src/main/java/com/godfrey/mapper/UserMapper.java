package com.godfrey.mapper;

import com.godfrey.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * description : 登录验证查询Mapper
 *
 * @author godfrey
 * @since 2020-05-26
 */
@Mapper
@Repository
public interface UserMapper {
    User selectPasswordByName(@Param("userName") String userName, @Param("password") String password);
}
