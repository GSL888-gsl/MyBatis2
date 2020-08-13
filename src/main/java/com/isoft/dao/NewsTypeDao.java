package com.isoft.dao;

import com.isoft.entity.NewsType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface NewsTypeDao {
    @Select("select * from tb_type where id=#{typeid}")
    NewsType getBaseById(@Param("typeid") Integer typeid);

    NewsType getById(Integer typeid);



    @Select("SELECT tb_type.id as tid , tb_type.typename , tb_news.*" +
            "        from tb_type inner join tb_news on tb_type.id=tb_news.typeid" +
            "        where tb_type.id=#{typeId}")
    @ResultMap("com.isoft.mapper.resultmapper.NewsTypeMap")
    NewsType getById2(Integer typeid);

}
