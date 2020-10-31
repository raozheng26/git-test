/**
 * @author RaoZheng
 * @create 2020-10-31 14:56
 */

import com.atguigu.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 * @version 1.0
 * @author raozheng
 * @date 2020-10-31 14:56
 */
public class TestUser {

    @Test
    public void testUserDao(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = context.getBean("UserDao", UserDao.class);

        System.out.println(userDao);
        userDao.save();
    }
}
