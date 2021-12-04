package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.StaffArchives;
import com.gnyd.helloworld.mapper.StaffArchivesMapper;
import com.gnyd.helloworld.mapper.StaffEmploymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffArchivesMapperImpl implements StaffArchivesMapper {

    @Autowired
    private StaffArchivesMapper staffArchivesMapper;

    @Override
    public List<StaffArchives> queryAll() {
        List<StaffArchives> staffArchives = staffArchivesMapper.queryAll();
        return staffArchives;
    }

    @Override
    public StaffArchives queryById(int id) {
        StaffArchives staffArchives = staffArchivesMapper.queryById(id);
        return staffArchives;
    }

    @Override
    public Boolean saveStaArch(StaffArchives staffArchives) {
        return staffArchivesMapper.saveStaArch(staffArchives);
    }

    @Override
    public Boolean deleteStaArch(int id) {
        return staffArchivesMapper.deleteStaArch(id);
    }
}
