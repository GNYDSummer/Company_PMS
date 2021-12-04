package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.SysManage;
import com.gnyd.helloworld.mapper.SysManageMapper;
import com.gnyd.helloworld.service.SysManageService;
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
public class SysManageServiceImpl implements SysManageService {

    @Autowired
    private SysManageMapper sysManageMapper;

    @Override
    public List<SysManage> queryAll() {
        return sysManageMapper.queryAll();
    }

    @Override
    public SysManage queryById(int id) {
        return sysManageMapper.queryById(id);
    }

    @Override
    public List<SysManage> queryByCon(String search) {
        return sysManageMapper.queryByCon(search);
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
