package jp.milet.yr.org.domain;

import jp.milet.yr.basic.domain.BasicDomain;
import lombok.Data;

/**
 * @Description 员工
 * @Author yan
 * @Date 2021/8/9 15:55
 */
@Data
public class Employee extends BasicDomain {
    /** 员工名 */
    private String username;
    /** 邮箱 */
    private String email;
    /** 电话 */
    private String phone;
    /** 密码 */
    private String password;
    /** 年龄 */
    private Integer age;
    /** 状态 */
    private Integer state;

}
