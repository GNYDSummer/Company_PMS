package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.entity.StaffEmployment;
import com.gnyd.helloworld.mapper.DepManageMapper;
import com.gnyd.helloworld.mapper.StaffEmploymentMapper;
import com.gnyd.helloworld.service.StaffEmploymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Service
public class StaffEmploymentServiceImpl implements StaffEmploymentService {

    @Autowired
    private StaffEmploymentMapper staffEmploymentMapper;
    @Autowired
    private DepManageMapper depManageMapper;

    @Override
    public List<StaffEmployment> queryAll() {
        return staffEmploymentMapper.queryAll();
    }

    @Override
    public StaffEmployment queryById(int id) {
        return staffEmploymentMapper.queryById(id);
    }

    @Override
    public StaffEmployment queryStaByDepId(int id) {
        return staffEmploymentMapper.queryStaByDepId(id);
    }

    @Override
    public List<StaffEmployment> queryByCon(@Param("search") String search) {
        return staffEmploymentMapper.queryByCon(search);
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
