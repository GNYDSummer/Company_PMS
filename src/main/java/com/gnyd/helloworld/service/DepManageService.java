package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.DepManage;
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
public interface DepManageService {

    List<DepManage> queryAll();

    DepManage queryById(int id);

    List<DepManage> queryByCon(@Param("search") String search);

    Boolean saveDepMan(DepManage depManage);

    Boolean updateDepMan(DepManage depManage);

    Boolean deleteDepMan(int id);

}
