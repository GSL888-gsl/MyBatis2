package com.isoft.dao;

import com.isoft.entity.User2;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface User2Dao {
    User2 getbyId(@Param("id") Integer id);
    int add (User2 u);

    @Select("select * from user where name=#{name} and pass=#{pass}")
    @Results({
            @Result(id = true , column = "id" , property = "uid") ,
            @Result(column = "name" , property = "uname") ,
            @Result(column = "pass" , property = "upass") ,
            @Result(column = "moblie" , property = "moblie") ,
            @Result(column = "birthday" , property = "birthday") ,
            @Result(column = "regDatetime" , property = "reg") ,
    })
    User2 getUser(@Param("name") String name,@Param("pass") String pass);


    @Select("select * from user")
    @ResultMap("com.isoft.mapper.resultmapper.UserMap")
    List<User2> getAll() ;
}
