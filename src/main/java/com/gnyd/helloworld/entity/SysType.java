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
public class SysType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户类型
     */
    @TableId(value = "type_id", type = IdType.ASSIGN_ID)
    private Integer typeId;

    /**
     * 类型名称
     */
    private String name;

    private List<SysManage> sysManage;

}
