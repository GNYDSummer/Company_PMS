package com.gnyd.helloworld.service.impl;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.mapper.AttManageMapper;
import com.gnyd.helloworld.service.AttManageService;
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
public class AttManageServiceImpl implements AttManageService {

    @Autowired
    private AttManageMapper attManageMapper;

    @Override
    public List<AttManage> queryAll() {
        return attManageMapper.queryAll();
    }

    @Override
    public AttManage queryById(int id) {
        return attManageMapper.queryById(id);
    }

    @Override
    public List<AttManage> queryByCon(String search) {
        return attManageMapper.queryByCon(search);
    }

    @Override
    public Boolean saveAttMan(AttManage attManage) {
        return attManageMapper.saveAttMan(attManage);
    }

    @Override
    public Boolean updateAttMan(AttManage attManage) {
        return attManageMapper.updateAttMan(attManage);
    }

    @Override
    public Boolean deleteAttMan(int id) {
        return attManageMapper.deleteAttMan(id);
    }
}
