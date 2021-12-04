package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.DepManage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
public interface DepManageMapper {

    List<DepManage> queryAll();

    DepManage queryById(int id);

    List<DepManage> queryByCon(@Param("search") String search);

    Boolean saveDepMan(DepManage depManage);

    Boolean updateDepMan(DepManage depManage);

    Boolean deleteDepMan(int id);

}
