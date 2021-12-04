package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.DepManage;
import com.gnyd.helloworld.entity.StaffEmployment;
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
public interface StaffEmploymentService {

    List<StaffEmployment> queryAll();

    StaffEmployment queryById(int id);

    StaffEmployment queryStaByDepId(int id);

    List<StaffEmployment> queryByCon(@Param("search") String search);

    Boolean saveStaEmp(StaffEmployment staffEmployment);

    Boolean updateStaEmp(StaffEmployment staffEmployment);

    Boolean deleteStaEmp(int id);

}
