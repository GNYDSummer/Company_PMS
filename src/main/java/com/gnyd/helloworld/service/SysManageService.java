package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.SysManage;
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
public interface SysManageService {

    List<SysManage> queryAll();

    SysManage queryById(int id);

    List<SysManage> queryByCon(@Param("search") String search);

    Boolean saveSysMan(SysManage sysManage);

    Boolean updateSysMan(SysManage sysManage);

    Boolean deleteSysMan(int id);

}
