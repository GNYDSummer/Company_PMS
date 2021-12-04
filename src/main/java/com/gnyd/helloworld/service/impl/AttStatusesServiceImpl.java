package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatuses;
import com.gnyd.helloworld.mapper.AttStatusesMapper;
import com.gnyd.helloworld.service.AttStatusesService;
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
public class AttStatusesServiceImpl implements AttStatusesService {

    @Autowired
    private AttStatusesMapper attStatusesMapper;

    @Override
    public List<AttStatuses> queryAll() {
        return attStatusesMapper.queryAll();
    }

    @Override
    public AttStatuses queryById(int id) {
        return attStatusesMapper.queryById(id);
    }

    @Override
    public List<AttStatuses> queryByCon(String search) {
        return attStatusesMapper.queryByCon(search);
    }
}
