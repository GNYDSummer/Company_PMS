package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.mapper.DepManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepManageMapperImpl implements DepManageMapper {

    @Autowired
    private DepManageMapper depManageMapper;

    @Override
    public List<DepManage> queryAll() {
        List<DepManage> depManages = depManageMapper.queryAll();
        return depManages;
    }

    @Override
    public DepManage queryById(int id) {
        DepManage depManage = depManageMapper.queryById(id);
        return depManage;
    }

    @Override
    public List<DepManage> queryByCon(String search) {
        List<DepManage> depManages = depManageMapper.queryByCon(search);
        return depManages;
    }

    @Override
    public Boolean saveDepMan(DepManage depManage) {
        return depManageMapper.saveDepMan(depManage);
    }

    @Override
    public Boolean updateDepMan(DepManage depManage) {
        return depManageMapper.updateDepMan(depManage);
    }

    @Override
    public Boolean deleteDepMan(int id) {
        return depManageMapper.deleteDepMan(id);
    }
}
