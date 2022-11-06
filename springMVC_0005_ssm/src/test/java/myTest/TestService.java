package myTest;

import com.sky.mapper.UserMapper;
import com.sky.pojo.User;
import com.sky.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_mapper.xml", "classpath:spring_service.xml"})
public class TestService {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @Test
    public void test1(){
        List<User> userList = userService.selectUserPage("郝", "男", 0);
        userList.forEach(user -> System.out.println(user));
    }
    @Test
    public void testDeleteUserById(){
        int i = userService.deleteUserById("159456489535185");
        System.out.println(i);
        test1();
    }
    @Test
    public void testGetRowCount(){
        int rowCount = userService.getRowCount("郝", "男");
        System.out.println(rowCount);
    }
    @Test
    public void testCreateUser(){
        User user = new User("159456489535196","身份证","3534755125782558","郝文韬","男","18","学生");
        userService.createUser(user);
        test1();
    }
}
