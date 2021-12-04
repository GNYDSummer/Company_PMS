package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.StaffStatuses;
import com.gnyd.helloworld.mapper.StaffStatusesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffStatusesMapperImpl implements StaffStatusesMapper {

    @Autowired
    private StaffStatusesMapper staffStatusesMapper;

    @Override
    public List<StaffStatuses> queryAll() {
        List<StaffStatuses> staffStatuses = staffStatusesMapper.queryAll();
        return staffStatuses;
    }

    @Override
    public StaffStatuses queryById(int id) {
        StaffStatuses staffStatuses = staffStatusesMapper.queryById(id);
        return staffStatuses;
    }
}
