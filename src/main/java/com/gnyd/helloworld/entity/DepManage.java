package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author gnyd
 * @since 2021-11-10
 */
@Data
//@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class DepManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门编号
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门负责人
     */
    private String principal;

    /**
     * 上级部门编号
     */
    private DepManage depManage;

    private int officeId;

    private List<StaffEmployment> staffEmployments;


}
