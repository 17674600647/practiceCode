package SSM.Mybatis;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ：lzy
 * @ Date       ：Created in 9:08 2021/7/21
 * @ Description：查询全部数据
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        //加载配置文件:
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisConfig.xml");
        //获取SqlSession对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行SQL语句
        List<Object> objects = sqlSession.selectList("StudentMapper.selectAll");

        PageHelper.startPage(1, 3);
        //输出结果
        objects.forEach((s) -> {
            System.out.println(s);
        });
        sqlSession.close();
    }
}
