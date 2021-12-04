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
public class AttManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 考勤编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer staffId;

    private StaffEmployment staffEmployment;

    /**
     * 员工考勤状态 0表示签到 1表示缺勤 2表示迟到 3表示请假
     */
    private AttStatuses attStatus;

    private Integer status;

    /**
     * 员工考勤时间
     */
    private Date attTime;


}
