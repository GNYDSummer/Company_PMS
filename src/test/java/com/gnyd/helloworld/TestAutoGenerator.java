package com.gnyd.helloworld;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

public class TestAutoGenerator {

    @Test
    public void autoGenerator() {
        // 代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        // 代码生成目录
        String projectPath = "/Volumes/Extreme SSD/IDEA project/Springboot/helloworld";
        // 拼接输出目录
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        // 配置开发者信息
        globalConfig.setAuthor("gnyd");
        // 配置是否打开目录
        globalConfig.setOpen(false);
        // Swagger注解
//        globalConfig.setSwagger2(true);
        // 重新生成文件是否覆盖
        globalConfig.setFileOverride(false);
        // 配置主键生成策略，此处为 ASSIGN_ID
        globalConfig.setIdType(IdType.ASSIGN_ID);
        // 配置日期类型，此处为 ONLY_DATE
        globalConfig.setDateType(DateType.ONLY_DATE);
        // 默认生成的 service 会有 I 前缀
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);

        // 数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        // 配置数据库 url 地址
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/Company_PMS?useUnicode=true&characterEncoding=utf8");
//        dsc.setSchemaName("testMyBatisPlus"); // 可以直接在 url 中指定数据库名
        // 配置数据库驱动
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        // 配置数据库连接用户名
        dataSourceConfig.setUsername("root");
        // 配置数据库连接密码
        dataSourceConfig.setPassword("ln13725607887");
        autoGenerator.setDataSource(dataSourceConfig);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        // 配置父包名
        packageConfig.setParent("com.gnyd");
        // 配置模块名
        packageConfig.setModuleName("helloworld");
        // 配置 entity 包名
        packageConfig.setEntity("entity");
        // 配置 mapper 包名
        packageConfig.setMapper("mapper");
        // 配置 service 包名
        packageConfig.setService("service");
        // 配置 controller 包名
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);

        // 策略配置（数据库表配置）
        StrategyConfig strategy = new StrategyConfig();
        // 指定表名（可以同时操作多个表，使用 , 隔开）
        strategy.setInclude("att_manage", "att_statistics", "att_statuses", "dep_manage", "ent_events", "rewards", "staff_archives",
                "staff_employment", "staff_statuses", "sys_manage", "sys_type");
        // 配置数据表与实体类名之间映射的策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 配置数据表的字段与实体类的属性名之间映射的策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 配置 lombok 模式
        strategy.setEntityLombokModel(true);
        // 配置 rest 风格的控制器（@RestController）
        strategy.setRestControllerStyle(true);
        // 配置驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);
        // 配置表前缀，生成实体时去除表前缀
        // 此处的表名为 test_mybatis_plus_user，模块名为 test_mybatis_plus，去除前缀后剩下为 user。
//        strategy.setTablePrefix(packageConfig.getModuleName() + "_");
        autoGenerator.setStrategy(strategy);

        // 执行代码生成操作
        autoGenerator.execute();

    }

}
