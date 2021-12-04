package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.SysManage;
import com.gnyd.helloworld.mapper.SysManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysManageMapperImpl implements SysManageMapper {

    @Autowired
    private SysManageMapper sysManageMapper;

    @Override
    public List<SysManage> queryAll() {
        List<SysManage> sysManages = sysManageMapper.queryAll();
        return sysManages;
    }

    @Override
    public SysManage queryById(int id) {
        SysManage sysManage = sysManageMapper.queryById(id);
        return sysManage;
    }

    @Override
    public List<SysManage> queryByCon(String search) {
        List<SysManage> sysManages = sysManageMapper.queryByCon(search);
        return sysManages;
    }

    @Override
    public Boolean saveSysMan(SysManage sysManage) {
        return sysManageMapper.saveSysMan(sysManage);
    }

    @Override
    public Boolean updateSysMan(SysManage sysManage) {
        return sysManageMapper.updateSysMan(sysManage);
    }

    @Override
    public Boolean deleteSysMan(int id) {
        return sysManageMapper.deleteSysMan(id);
    }
}
