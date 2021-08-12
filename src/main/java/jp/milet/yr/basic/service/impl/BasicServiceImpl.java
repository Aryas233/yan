package jp.milet.yr.basic.service.impl;

import jp.milet.yr.basic.mapper.BasicMapper;
import jp.milet.yr.basic.query.BasicQuery;
import jp.milet.yr.basic.service.IBasicService;
import jp.milet.yr.org.domain.Department;
import jp.milet.yr.org.mapper.DepartmentMapper;
import jp.milet.yr.org.query.DepartmentQuery;
import jp.milet.yr.util.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/12 21:49
 */
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class BasicServiceImpl<T> implements IBasicService<T> {
    @Autowired
    private BasicMapper<T> basicMapper;

    @Override
    @Transactional
    public void add(T t) {
        basicMapper.add(t);
    }

    @Override
    @Transactional
    public void update(T t) {
        basicMapper.update(t);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        basicMapper.delete(id);
    }

    @Override
    public T findById(Long id) {
        return basicMapper.findById(id);
    }

    @Override
    public List<T> findAll() {
        return basicMapper.findAll();
    }

    @Override
    public PageResult queryPage(BasicQuery basicQuery) {
        // 查询总条数
        Long total = basicMapper.findCount(basicQuery);
        // 如果没有数据，直接返回
        if (total == null || total == 0) {
            return new PageResult();
        }
        // 查询具体数据
        List<T> data = basicMapper.queryPage(basicQuery);
        return new PageResult(total, data);
    }
    /**
     * description 批量删除
     *
     * @param ids
     * @return void
     * @author yan
     * @date 2021/8/10 10:41:09
     * @version 1.0
     */
    @Override
    @Transactional
    public void batchDelete(Long[] ids) {
        basicMapper.batchDelete(ids);
    }
}
