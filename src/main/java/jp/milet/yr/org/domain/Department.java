package jp.milet.yr.org.domain;

import jp.milet.yr.basic.domain.BasicDomain;
import lombok.Data;

/**
 * @Description 部门类
 * @Author yan
 * @Date 2021/8/6 16:14
 */
@Data
public class Department extends BasicDomain {

    /** 部门编号 */
    private String sn;
    /** 部门名 */
    private String name;
    /** 状态 */
    private Integer state;
    /** 部门管理员id */
    private Long manager_id;
    /** 部门管理员 */
    private Employee manager;
    /** 上级部门id */
    private Long parent_id;
    /** 上级部门id */
    private Department parent;
}
