package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.SysManage;
import com.gnyd.helloworld.entity.SysType;
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
public interface SysTypeMapper {

    List<SysType> queryAll();

    SysType queryById(int id);

}
