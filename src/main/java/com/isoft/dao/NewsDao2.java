package com.isoft.dao;

import com.isoft.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDao2 {
    /**
     * 新闻查询（不分页），以下三个条件任意组合
     *      * 	1）按照新闻类别查询
     *      * 	2）按照新闻关键字查询
     *      * 	3）按照日期查询（某天的新闻）
     * @param typeId   类别id
     * @param titleKey  标题关键字
     * @param dateStr   查询日期 年-月-日
     * @return
     */
    @Select(
            "<script>" +
                    " select * from tb_news" +
                    "        <where>" +
                    "            <if test=\"null!=typeId\">" +
                    "                and typeid=#{typeId}" +
                    "            </if>" +
                    "            <if test=\"null!=titleKey\">" +
                    "            <bind name=\"titleK\" value=\"'%'+titleKey+'%'\"/>" +
                    "                and title=like #{titleK}" +
                    "            </if>" +
                    "            <if test=\"null!=dateStr\">" +
                    "                and DATE_FORMAT(pubdatetime,'%Y-%m-%d')=#{dateStr}" +
                    "            </if>" +
                    "        </where>"
                    + "</script>"
    )
//    List<News> getNews(@Param("typeId") Integer typeId , @Param("titleKey") String titleKey , @Param("dateStr") String dateStr) ;



//    List<News> getNews2(@Param("typeId") Integer typeId , @Param("titleKey") String titleKey , @Param("dateStr") String dateStr) ;

    /**
     * 可以更新类别，标题，内容，来源
     * @param news
     * @return
     */
    int updateById(News news) ;

    int updateById2(News news) ;
    /**
     * 根据多个id进行删除
     * @param ids
     * @return
     */
    int deleteByIds(List<Integer> ids) ;

    int insert(List<News> list);
    List<News> getNews3(@Param("typeId") Integer typeId , @Param("titleKey") String titleKey , @Param("dateStr") String dateStr) ;



}