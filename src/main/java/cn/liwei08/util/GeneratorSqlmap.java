package cn.liwei08.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @className : GeneratorSqlmap
 * @Description MyBatis逆向工程
 * @author: Li Wei
 * @date: 2019-04-15 20:38
 * Version : 1.0
 **/
public class GeneratorSqlmap {

    private static void generator() throws Exception {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        // 指定配置文件
        File configFile = new File("D:/workspace/idea/manger - 3/src/main/resources/GeneratorMapper.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }


    /**
     * 执行main方法以生成代码
     *
     * @param
     * @return void
     * @author wair0
     * @date 2019-04-15 20:41
     **/

    public static void main(String[] args) {
        try {
            generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}