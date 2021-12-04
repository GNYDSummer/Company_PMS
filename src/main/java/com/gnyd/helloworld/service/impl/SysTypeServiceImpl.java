package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.SysType;
import com.gnyd.helloworld.mapper.SysTypeMapper;
import com.gnyd.helloworld.service.SysTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Service
public class SysTypeServiceImpl implements SysTypeService {

    @Autowired
    private SysTypeMapper sysTypeMapper;

    @Override
    public List<SysType> queryAll() {
        return sysTypeMapper.queryAll();
    }

    @Override
    public SysType queryById(int id) {
        return sysTypeMapper.queryById(id);
    }
}
