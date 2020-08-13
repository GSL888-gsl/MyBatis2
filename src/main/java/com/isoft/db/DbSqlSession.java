package com.isoft.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class DbSqlSession {
    private static DbSqlSession ourInstance=null;

    public static synchronized DbSqlSession getInstance(String cofigName){
        ourInstance=new DbSqlSession(cofigName);
        return ourInstance;
    }

    private static SqlSession sqlSession;

    private DbSqlSession(String cofigName){
        if (null==cofigName || cofigName.trim().length()==0){
            cofigName="mybatis-conf.xml";
        }
        try {
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(cofigName)) ;
            sqlSession = factory.openSession() ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  SqlSession getSqlSession(){
        return sqlSession;
    }
    public static  void close() {
        if (null != sqlSession) {
            sqlSession.close();
            sqlSession = null;
        }
    }
}
