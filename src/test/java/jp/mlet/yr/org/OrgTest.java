package jp.mlet.yr.org;

import jp.milet.yr.Application;
import jp.milet.yr.org.domain.Department;
import jp.milet.yr.org.mapper.DepartmentMapper;
import jp.milet.yr.org.service.IDepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/6 17:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrgTest {
    @Autowired
    private IDepartmentService departmentService;
    @Test
    public void  test() throws Exception {
        List<Department> all = departmentService.findAll();
        System.out.println(all);

    }
}
