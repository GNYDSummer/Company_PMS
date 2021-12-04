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
@EqualsAndHashCode(callSuper = false)
public class StaffStatuses implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工状态
     */
    @TableId(value = "status_id", type = IdType.ASSIGN_ID)
    private Integer statusId;

    /**
     * 状态名称
     */
    private String name;

    private List<StaffEmployment> staffEmployments;

}
