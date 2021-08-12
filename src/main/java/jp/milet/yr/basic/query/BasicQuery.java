package jp.milet.yr.basic.query;

import lombok.Data;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/12 21:25
 */
@Data
public class BasicQuery {
    /** 当前页 */
    private Integer currentPage = 1;
    /** 页容量 */
    private Integer pageSize = 5;
    /** 关键字 */
    private String keywords;
    public Integer getStart(){
        return (currentPage - 1) * pageSize;
    }
}
