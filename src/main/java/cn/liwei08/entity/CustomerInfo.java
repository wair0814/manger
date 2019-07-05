package cn.liwei08.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Administrator
 * @className CustomerInfo
 * @Description 所有的医院列表
 * @date 2018-07-08 15:49
 * @Version 1.0
 **/
@Data
public class CustomerInfo {
    /**
     * 客户信息ID
     */
    private Integer customerId;

    /**
     * 客户信息名称
     */
    private String customerName;

    /**
     * 客户信息状态码
     */
    private Integer customerStopMark;

    /**
     * 客户信息添加时间
     */
    private Date customerCreatetime;
}