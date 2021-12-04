package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.SysType;
import com.gnyd.helloworld.mapper.SysTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysTypeMapperImpl implements SysTypeMapper {

    @Autowired
    private SysTypeMapper sysTypeMapper;

    @Override
    public List<SysType> queryAll() {
        List<SysType> sysTypes = sysTypeMapper.queryAll();
        return sysTypes;
    }

    @Override
    public SysType queryById(int id) {
        SysType sysType = sysTypeMapper.queryById(id);
        return sysType;
    }
}
