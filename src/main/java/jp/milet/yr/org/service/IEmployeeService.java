package jp.milet.yr.org.service;

import jp.milet.yr.basic.service.IBasicService;
import jp.milet.yr.org.domain.Employee;
import jp.milet.yr.org.query.EmployeeQuery;
import jp.milet.yr.util.PageResult;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/10 13:25
 */
public interface IEmployeeService extends IBasicService<Employee> {
    void deleteConnect(Long id);
}
