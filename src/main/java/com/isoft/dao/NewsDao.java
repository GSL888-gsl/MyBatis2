package com.isoft.dao;

import com.isoft.entity.News;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsDao {
    @Select("select * from tb_news where typeid=#{typeId}")
    List<News> getByTypeid(Integer typeId) ;

    /**
     * 根据id查看新闻
     * @param id
     * @return
     */
    @Select("select * from tb_news where id=#{id}")
    News getBaseById(Integer id) ;

    /**
     * 根据id查看新闻，类别
     * @param id
     * @return
     */
    News getById(Integer id) ;

    @Select(" SELECT tb_type.id as tid , tb_type.typename , tb_news.*" +
            "        from tb_type inner join tb_news on tb_type.id=tb_news.typeid" +
            "        where tb_news.id=#{id}")
    @ResultMap("com.isoft.mapper.resultmapper.NewsMap")
    News getById2(Integer id) ;
}
