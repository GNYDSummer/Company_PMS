package com.gnyd.helloworld.entity;

import java.math.BigDecimal;
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
public class Rewards implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 薪资编号
     */
    @TableId(value = "reward_id", type = IdType.ASSIGN_ID)
    private Integer rewardId;

    /**
     * 员工工作证号
     */
    private Integer staffId;

    /**
     * 员工工资
     */
    private BigDecimal salary;

    /**
     * 员工奖金
     */
    private BigDecimal reward;

}
