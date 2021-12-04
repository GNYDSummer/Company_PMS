package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.StaffStatuses;
import com.gnyd.helloworld.mapper.StaffStatusesMapper;
import com.gnyd.helloworld.service.StaffStatusesService;
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
public class StaffStatusesServiceImpl implements StaffStatusesService {

    @Autowired
    private StaffStatusesMapper staffStatusesMapper;

    @Override
    public List<StaffStatuses> queryAll() {
        return staffStatusesMapper.queryAll();
    }

    @Override
    public StaffStatuses queryById(int id) {
        return staffStatusesMapper.queryById(id);
    }
}
