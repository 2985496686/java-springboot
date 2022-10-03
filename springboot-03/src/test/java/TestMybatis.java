import com.MainClass;
import com.eneity.User;
import com.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MainClass.class)
public class TestMybatis {

    @Autowired
    private  UserMapper userMapper;

    @Test
    public void testGetUser(){
        List<User> users = userMapper.getUser();
        for (User user :users){
            System.out.println(user);
        }
    }

    @Test
    public void testInsert(){
        userMapper.insertUser("张三");
        userMapper.insertUser("李四");
        userMapper.insertUser("王五");
        userMapper.insertUser("刘六");
    }
}
