import com.MainClass;
import com.dao.UserCacheDao;
import com.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;


@SpringBootTest(classes = MainClass.class)
public class TestRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserCacheDao userCacheDao;

    @Test
    public void testRedis(){
        User user = new User("张三",2);
        redisTemplate.opsForValue().set("user","{id:12;name:/}");
        Object user1 = redisTemplate.opsForValue().get("user");
        System.out.println((User)user1);
    }
    @Test
    public void testRedisDao(){
        userCacheDao.setUser(new User("张三",2));
        User user = userCacheDao.getUser(2);
        System.out.println(user);
    }
}
