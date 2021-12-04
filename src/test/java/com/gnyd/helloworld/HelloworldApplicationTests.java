package com.gnyd.helloworld;

import com.alibaba.druid.util.JdbcUtils;
import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.entity.StaffEmployment;
import com.gnyd.helloworld.mapper.DepManageMapper;
import com.gnyd.helloworld.mapper.StaffEmploymentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class HelloworldApplicationTests {

    @Autowired
    private StaffEmploymentMapper staffEmploymentMapper;
    @Autowired
    private DepManageMapper depManageMapper;

}
