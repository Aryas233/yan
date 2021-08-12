package jp.milet.yr.util;

import jp.milet.yr.org.domain.Department;
import lombok.Data;

import java.util.List;

/**
 * @Description 分页与高级查询结果
 * @Author yan
 * @Date 2021/8/9 14:48
 */
@Data
public class PageResult<T> {
    /** 总数 */
    private Long total = 0L;
    /** 数据 */
    private List<T> data = null;

    public PageResult() {
    }

    public PageResult(Long total, List<T> data) {
        this.total = total;
        this.data = data;
    }
}
