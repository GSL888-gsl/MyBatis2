import com.isoft.dao.NewsDao;
import com.isoft.db.DbSqlSession;
import org.apache.ibatis.session.SqlSession;

public class Test {
//    @org.junit.Test
//    public void test(){
//        SqlSession sqlSession = null ;
//        try {
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-conf.xml")) ;
//            sqlSession = factory.openSession() ;
//            User2Dao userDao = sqlSession.getMapper(User2Dao.class) ;
//            User2 u = new User2(null,"kkkkk","15555","15566291", DateUtil.str2Date2("2020-01-20"),null);
//            System.out.println(userDao.add(u));
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(null != sqlSession) {
//                sqlSession.close();
//                sqlSession = null ;
//            }
//        }
//    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession= DbSqlSession.getInstance(null).getSqlSession();

        NewsDao userDao = sqlSession.getMapper(NewsDao.class) ;
//        System.out.println(userDao.getUser("王宇","123456"));
//        System.out.println(userDao.getNews3(2,null,null));
//        DbSqlSession.close();
//        List<Integer> ids = new ArrayList<>() ;
//        ids.add(5) ; ids.add(6) ; ids.add(18) ;
//        System.out.println(userDao.deleteByIds(ids));
//        sqlSession.commit();
//        News news = new News() ;
//        news.setId(4);
//        news.setTypeid(4);
//        news.setTitle("动态sql2");
//        news.setContent("啦啦啦啦啦");
//        news.setPubdatetime(new Date());
//        System.out.println(userDao.updateById(news));
//        sqlSession.commit();
        System.out.println(userDao.getById(1));

    }
}
