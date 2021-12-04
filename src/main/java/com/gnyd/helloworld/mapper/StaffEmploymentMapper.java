package com.gnyd.helloworld.mapper;

import com.gnyd.helloworld.entity.StaffEmployment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Mapper
@Repository
public interface StaffEmploymentMapper {

    List<StaffEmployment> queryAll();

    StaffEmployment queryById(int id);

    StaffEmployment queryStaByDepId(int id);

    List<StaffEmployment> queryByCon(@Param("search") String search);

    Boolean saveStaEmp(StaffEmployment staffEmployment);

    Boolean updateStaEmp(StaffEmployment staffEmployment);

    Boolean deleteStaEmp(int id);

}
