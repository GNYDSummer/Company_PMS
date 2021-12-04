package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.AttManage;
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
public interface AttManageMapper {

    List<AttManage> queryAll();

    AttManage queryById(int id);

    List<AttManage> queryByCon(@Param("search") String search);

    Boolean saveAttMan(AttManage attManage);

    Boolean updateAttMan(AttManage attManage);

    Boolean deleteAttMan(int id);

}
