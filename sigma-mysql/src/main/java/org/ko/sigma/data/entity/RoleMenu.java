package org.ko.sigma.data.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import java.io.Serializable;

/**
 * <p>权限菜单关联表，事实表</p>
 * @author K.O
 */
@Data
@TableName("t_role_menu")
public class RoleMenu implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 角色编码，由系统统一生成，不可修改
     */
    private String roleCode;

    /**
     * 菜单编码，由系统统一生成，不可修改
     */
    private String menuCode;

    /**
     * 创建数据权限：0-否，1-是
     */
    private short create;

    /**
     * 读取详情权限：0-否，1-是
     */
    private short read;

    /**
     * 更新数据权限：0-否，1-是
     */
    private short update;

    /**
     * 删除数据权限：0-否，1-是
     */
    private short delete;

    /**
     * 数据状态：0-删除，1-有效
     */
    private short enable;

    /**
     * 更新版本
     */
    private Long version;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 创建时间
     */
    private java.util.Date gmtCreate;

    /**
     * 更新用户
     */
    private String modifiedUser;

    /**
     * 更新时间
     */
    private java.util.Date gmtModified;


}