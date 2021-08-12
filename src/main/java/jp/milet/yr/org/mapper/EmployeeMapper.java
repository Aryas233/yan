package jp.milet.yr.org.mapper;

import jp.milet.yr.basic.mapper.BasicMapper;
import jp.milet.yr.org.domain.Employee;
import jp.milet.yr.org.query.EmployeeQuery;

import java.util.List;


public interface EmployeeMapper extends BasicMapper<Employee> {


    /**
     * description 删除外键
     *
     * @param emp
     * @return void
     * @author yan
     * @date 2021/8/11 14:17:36
     * @version 1.0
     */
    void deleteConnect(Long id);
}
