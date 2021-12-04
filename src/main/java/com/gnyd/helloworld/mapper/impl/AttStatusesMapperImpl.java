package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatuses;
import com.gnyd.helloworld.mapper.AttStatusesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AttStatusesMapperImpl implements AttStatusesMapper {

    @Autowired
    private AttStatusesMapper attStatusesMapper;

    @Override
    public List<AttStatuses> queryAll() {
        List<AttStatuses> attStatuses = attStatusesMapper.queryAll();
        return attStatuses;
    }

    @Override
    public AttStatuses queryById(int id) {
        AttStatuses attStatuses = attStatusesMapper.queryById(id);
        return attStatuses;
    }

    @Override
    public List<AttStatuses> queryByCon(String search) {
        List<AttStatuses> attStatuses = attStatusesMapper.queryByCon(search);
        return attStatuses;
    }
}
