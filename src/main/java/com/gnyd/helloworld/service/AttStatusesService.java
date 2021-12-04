package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatuses;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
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
public interface AttStatusesService {

    List<AttStatuses> queryAll();

    AttStatuses queryById(int id);

    List<AttStatuses> queryByCon(@Param("search") String search);

}
