package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class AttStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    @TableId(value = "staff_id", type = IdType.ASSIGN_ID)
    private Integer staffId;

    /**
     * 签到次数
     */
    private Integer attCount;

    /**
     * 缺勤次数
     */
    private Integer absCount;

    /**
     * 迟到次数
     */
    private Integer lateCount;

    /**
     * 请假次数
     */
    private Integer leaCount;

    /**
     * 备注
     */
    private String remark;


}
