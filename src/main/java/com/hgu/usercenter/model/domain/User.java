package com.hgu.usercenter.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 *
 * @author <a href="https://github.com/xueyulinn">薛钰麟</a>
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 账号
     */
    @TableField("userAccount")
    private String userAccount;

    /**
     * 用户头像
     */
    @TableField("avatarUrl")
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 密码
     */
    @TableField("userPassword")

    private String userPassword;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态 0 - 正常
     */
    @TableField("userStatus")

    private Integer userStatus;

    /**
     * 创建时间
     */
    @TableField("createTime")

    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")

    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    @TableField("isDelete")

    private Integer isDelete;

    /**
     * 用户角色 0 - 普通用户 1 - 管理员
     */
    @TableField("userRole")

    private Integer userRole;

    /**
     * 星球编号
     */
    @TableField("planetCode")

    private String planetCode;

    /**
     * 标签 json 列表
     */
    private String tags;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
