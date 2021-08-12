package jp.milet.yr.basic.mapper;

import jp.milet.yr.basic.query.BasicQuery;

import java.util.List;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/12 21:23
 */
public interface BasicMapper<T> {
    void add(T t);

    void update(T t);

    void delete(Long id);

    T findById(Long id);

    List<T> findAll();


    Long findCount(BasicQuery basicQuery);

    List<T> queryPage(BasicQuery basicQuery);
    /**
     * description 批量删除
     *
     * @param ids
     * @return void
     * @author yan
     * @date 2021/8/11 14:16:15
     * @version 1.0
     */
    void batchDelete(Long[] ids);
}
