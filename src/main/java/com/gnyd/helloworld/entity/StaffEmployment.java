package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
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
public class StaffEmployment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工工作证号
     */
    private Integer staffId;

    private String staffName;

    /**
     * 员工入职日期
     */
    private Date entryDate;

    /**
     * 员工工作职位
     */
    private String jobPos;

    /**
     * 员工工作职能
     */
    private String capacity;

    /**
     * 上级员工编号
     */
    private StaffEmployment staffEmployment;

    private int employeeId;
    /**
     * 员工状态 0表示在职 1表示兼职 2表示试用 3表示离职 4表示返聘 5表示退休
     */
    private StaffStatuses staffStatuses;

    private int status;
    /**
     * 员工所在部门编号
     */
    private DepManage depManage;

    private int departmentId;

    private List<AttManage> attManages;

}
