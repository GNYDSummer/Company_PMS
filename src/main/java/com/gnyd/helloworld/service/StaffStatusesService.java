package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.StaffStatuses;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Service
public interface StaffStatusesService {

    List<StaffStatuses> queryAll();

    StaffStatuses queryById(int id);

}
