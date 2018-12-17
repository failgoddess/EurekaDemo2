package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //获取用户信息
    @Select("select * from person")
    List<UserEntity> getUser();

//    @Insert("insert into person values({#})")
//    int insertUser(UserEntity userEntity);
}
