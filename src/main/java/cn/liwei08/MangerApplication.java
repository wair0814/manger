package cn.liwei08;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;


@SpringBootApplication
@MapperScan(basePackages = "cn.liwei08.mapper")
public class MangerApplication {
    /**
     * 配置mybatis的分页插件pageHelper
     */
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        /**
         * 配置mysql数据库的方言
         */
        properties.setProperty("dialect", "mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

    public static void main(String[] args) {
        SpringApplication.run(MangerApplication.class, args);
    }
}
