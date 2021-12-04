package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
public class EntEvents implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 事件序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer staffId;

    /**
     * 调动日期
     */
    private Date removeDate;

    /**
     * 调动时间
     */
    private Date removeTime;

    /**
     * 调入部门
     */
    private String transferIn;

    /**
     * 调出部门
     */
    private String transferOut;

    /**
     * 调动原因
     */
    private String transCause;


}
