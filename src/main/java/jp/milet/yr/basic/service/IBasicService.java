package jp.milet.yr.basic.service;

import jp.milet.yr.basic.query.BasicQuery;
import jp.milet.yr.org.domain.Employee;
import jp.milet.yr.org.query.EmployeeQuery;
import jp.milet.yr.util.PageResult;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/12 21:44
 */
public interface IBasicService<T> {
    void add(T t);

    void update(T t);

    void delete(Long id);

    T findById(Long id);

    List<T> findAll();

    PageResult queryPage(BasicQuery basicQuery);

    void batchDelete(Long[] ids);

}
