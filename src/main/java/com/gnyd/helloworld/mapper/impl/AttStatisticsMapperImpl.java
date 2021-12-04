package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.mapper.AttStatisticsMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AttStatisticsMapperImpl implements AttStatisticsMapper {
    @Override
    public List<AttManage> queryAll() {
        return null;
    }

    @Override
    public AttManage queryById(int id) {
        return null;
    }

    @Override
    public List<AttManage> queryByCon(String search) {
        return null;
    }

    @Override
    public Boolean saveAttMan(AttManage attManage) {
        return null;
    }

    @Override
    public Boolean updateAttMan(AttManage attManage) {
        return null;
    }

    @Override
    public Boolean deleteAttMan(int id) {
        return null;
    }
}
