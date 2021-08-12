package jp.milet.yr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Author yan
 * @Date 2021/8/6 15:09
 */
@SpringBootApplication
@MapperScan("jp.milet.yr.org.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
