package cn.liwei08.entity;

import lombok.Data;

import java.util.Date;

/**
 * @className : SysUser
 * @Description 用户实体
 * @author: Li Wei
 * @date: 2019-05-03 14:08
 * Version : 1.0
 **/
@Data
public class SysUser {
    /**
     *
     */
    private Long userId;
    /**
     *
     */
    private String userName;
    /**
     *
     */
    private String userRealname;
    /**
     *
     */
    private String userSex;
    /**
     *
     */
    private Integer userAge;
    /**
     *
     */
    private String userCpwd;
    /**
     *
     */
    private String userEmail;
    /**
     *
     */
    private String userCode;
    /**
     *
     */
    private Integer userStopmark;
    /**
     *
     */
    private String userQq;
    /**
     *
     */
    private String userPhone;
    /**
     *
     */
    private String userIp;
    /**
     *
     */
    private Date userCreatetime;
}