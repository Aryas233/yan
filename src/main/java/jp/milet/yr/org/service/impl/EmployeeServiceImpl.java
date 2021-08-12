package jp.milet.yr.org.service.impl;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
import jp.milet.yr.basic.service.impl.BasicServiceImpl;
import jp.milet.yr.org.domain.Employee;
import jp.milet.yr.org.mapper.EmployeeMapper;
import jp.milet.yr.org.query.EmployeeQuery;
import jp.milet.yr.org.service.IEmployeeService;
import jp.milet.yr.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/10 13:25
 */
@Service
public class EmployeeServiceImpl extends BasicServiceImpl<Employee> implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    /**
     * description 删除带有角色信息的雇员
     *
     * @param id
     * @return void
     * @author yan
     * @date 2021/8/11 14:23:32
     * @version 1.0
     */
    @Override
    @Transactional
    public void deleteConnect(Long id) {
        // 先删除外键约束
        employeeMapper.deleteConnect(id);
        // 再删除该条雇员数据
        employeeMapper.delete(id);
    }
}
