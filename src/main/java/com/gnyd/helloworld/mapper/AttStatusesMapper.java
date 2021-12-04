package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.AttManage;
import com.gnyd.helloworld.entity.AttStatuses;
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
public interface AttStatusesMapper {

    List<AttStatuses> queryAll();

    AttStatuses queryById(int id);

    List<AttStatuses> queryByCon(@Param("search") String search);

}
