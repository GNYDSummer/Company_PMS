package com.gnyd.helloworld.mapper.impl;

import com.gnyd.helloworld.entity.StaffEmployment;
import com.gnyd.helloworld.mapper.StaffEmploymentMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaffEmploymentMapperImpl implements StaffEmploymentMapper {

    @Autowired
    private StaffEmploymentMapper staffEmploymentMapper;

    @Override
    public List<StaffEmployment> queryAll() {
        List<StaffEmployment> staffEmployments = staffEmploymentMapper.queryAll();
        return staffEmployments;
    }

    @Override
    public StaffEmployment queryById(int id) {
        StaffEmployment staffEmployment = staffEmploymentMapper.queryById(id);
        return staffEmployment;
    }

    @Override
    public StaffEmployment queryStaByDepId(int id) {
        StaffEmployment staffEmployment = staffEmploymentMapper.queryStaByDepId(id);
        return staffEmployment;
    }

    @Override
    public List<StaffEmployment> queryByCon(@Param("search") String search) {
        List<StaffEmployment> staffEmployments = staffEmploymentMapper.queryByCon(search);
        return staffEmployments;
    }

    @Override
    public Boolean saveStaEmp(StaffEmployment staffEmployment) {
        return staffEmploymentMapper.saveStaEmp(staffEmployment);
    }

    @Override
    public Boolean updateStaEmp(StaffEmployment staffEmployment) {
        return staffEmploymentMapper.updateStaEmp(staffEmployment);
    }

    @Override
    public Boolean deleteStaEmp(int id) {
        return staffEmploymentMapper.deleteStaEmp(id);
    }
}
