package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.StaffArchives;
import com.gnyd.helloworld.mapper.StaffArchivesMapper;
import com.gnyd.helloworld.service.StaffArchivesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class StaffArchivesServiceImpl implements StaffArchivesService {

    @Autowired
    private StaffArchivesMapper staffArchivesMapper;

    @Override
    public List<StaffArchives> queryAll() {
        return staffArchivesMapper.queryAll();
    }

    @Override
    public StaffArchives queryById(int id) {
        return staffArchivesMapper.queryById(id);
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
