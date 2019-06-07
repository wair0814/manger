package cn.liwei08.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author Administrator
 * @className CustomerInfo
 * @Description 所有的医院列表
 * @date 2018-07-08 15:49
 * @Version 1.0
 **/
@Setter
@Getter
@ToString
public class CustomerInfo {
    /**
     *
     */
    private Integer customerId;

    /**
     *
     */
    private String customerName;

    /**
     *
     */
    private Integer customerStopmark;

    /**
     *
     */
    private Date customerCreatetime;


}