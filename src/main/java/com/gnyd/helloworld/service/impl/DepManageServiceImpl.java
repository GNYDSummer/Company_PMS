package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.mapper.DepManageMapper;
import com.gnyd.helloworld.service.DepManageService;
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
public class DepManageServiceImpl implements DepManageService {

    @Autowired
    private DepManageMapper depManageMapper;

    @Override
    public List<DepManage> queryAll() {
        return depManageMapper.queryAll();
    }

    @Override
    public DepManage queryById(int id) {
        return depManageMapper.queryById(id);
    }

    @Override
    public List<DepManage> queryByCon(String search) {
        return depManageMapper.queryByCon(search);
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
