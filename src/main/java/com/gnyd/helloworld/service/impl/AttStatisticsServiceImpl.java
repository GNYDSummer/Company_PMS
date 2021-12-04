package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatistics;
import com.gnyd.helloworld.mapper.AttStatisticsMapper;
import com.gnyd.helloworld.service.AttStatisticsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AttStatisticsServiceImpl implements AttStatisticsService {

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
