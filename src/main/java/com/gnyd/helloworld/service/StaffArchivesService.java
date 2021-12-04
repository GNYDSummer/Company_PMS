package com.gnyd.helloworld.service;

import com.gnyd.helloworld.entity.StaffArchives;
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
public interface StaffArchivesService {

    List<StaffArchives> queryAll();

    StaffArchives queryById(int id);

    Boolean saveStaArch(StaffArchives staffArchives);

    Boolean deleteStaArch(int id);

}
