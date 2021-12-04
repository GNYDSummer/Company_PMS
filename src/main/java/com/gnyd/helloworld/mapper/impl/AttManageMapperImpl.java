package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.mapper.AttManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AttManageMapperImpl implements AttManageMapper {

    @Autowired
    private AttManageMapper attManageMapper;

    @Override
    public List<AttManage> queryAll() {
        List<AttManage> attManages = attManageMapper.queryAll();
        return attManages;
    }

    @Override
    public AttManage queryById(int id) {
        AttManage attManage = attManageMapper.queryById(id);
        return attManage;
    }

    @Override
    public List<AttManage> queryByCon(String search) {
        List<AttManage> attManages = attManageMapper.queryByCon(search);
        return attManages;
    }

    @Override
    public Boolean saveAttMan(AttManage attManage) {
        return attManageMapper.saveAttMan(attManage);
    }

    @Override
    public Boolean updateAttMan(AttManage attManage) {
        return attManageMapper.updateAttMan(attManage);
    }

    @Override
    public Boolean deleteAttMan(int id) {
        return attManageMapper.deleteAttMan(id);
    }
}
