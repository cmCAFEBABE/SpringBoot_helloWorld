package hello.Service.ServiceImpl;

import hello.Dao.UserBean;
import hello.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @author 陈敏(chenmin5 @ corp.netease.com)
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceImplTest {

    @Autowired
    UserService userService;
    @Test
    public void getMyBatiesUserNameList() {
    }

    @Test
    public void getUserById() {
    }

    @Test
    public void getUser() {
    }

    @Test
    @Transactional
    @Rollback(true)
    public void insertUser() {
        UserBean user = UserBean.builder().name("chenmin").birthday("19950808").build();
        userService.insertUser(user);
    }
}