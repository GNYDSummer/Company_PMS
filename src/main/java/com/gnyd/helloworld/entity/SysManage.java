package com.gnyd.helloworld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
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
public class SysManage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户登录账号
     */
    private String loginAccount;

    /**
     * 用户登录密码
     */
    private String loginPassword;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户类型 0表示系统管理员 1表示普通用户
     */
    private SysType sysType;

    private Integer userType;

}
