package com.sky.mapper;

import com.sky.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUserPage(@Param("userName") String userName, @Param("userSex")String userSex, @Param("startRow")int startRow);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(@Param("userName")String userName, @Param("userSex")String userSex);
}
