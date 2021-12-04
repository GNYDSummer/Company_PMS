package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.StaffArchives;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Mapper
@Repository
public interface StaffArchivesMapper {

    List<StaffArchives> queryAll();

    StaffArchives queryById(int id);

    Boolean saveStaArch(StaffArchives staffArchives);

    Boolean deleteStaArch(int id);

}
