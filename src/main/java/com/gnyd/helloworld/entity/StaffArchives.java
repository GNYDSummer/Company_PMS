package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class StaffArchives implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    private StaffEmployment staffEmployment;
    /**
     * 员工姓名
     */
    private String name;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 员工民族
     */
    private String nation;

    /**
     * 员工生日
     */
    private Date birthday;

    /**
     * 员工政治面貌
     */
    private String polStatus;

    /**
     * 员工文化程度
     */
    private String education;

    /**
     * 员工婚姻状况
     */
    private String marStatus;

    /**
     * 员工籍贯
     */
    private String address;

    /**
     * 员工身份证号
     */
    @TableField("Sid")
    private String sid;

    /**
     * 员工电话号码
     */
    private String phone;

    /**
     * 员工档案存放地
     */
    private String file;

    /**
     * 员工户口所在地
     */
    private String residence;


}
