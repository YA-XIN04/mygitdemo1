import com.myit.dao.DeptMapper;
import com.myit.pojo.Dept;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeptTest {
    @Test
    public void getDeptById() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptMapper deptMapper = applicationContext.getBean(DeptMapper.class);
        Dept dept = deptMapper.findById(1);
        System.out.println(dept);
    }
}
