package cn.liwei08.mapper;

import cn.liwei08.entity.CustomerInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className : CustomerInfoMapper
 * @Description 医院信息列表管理
 * @author: Li Wei
 * @date: 2018-12-24 17:38
 * Version : 1.0
 **/
@Repository
public interface CustomerInfoMapper {

    /**
     * TODO
     *
     * @param customerId
     * @return
     * @author Li Wei
     * @date 2019-05-05 11:34
     **/
    CustomerInfo selectByPrimaryKey(Integer customerId);


    /**
     * 查询客户列表
     *
     * @return 返回集合哦
     * @author wair0
     * @date 2019-05-03 14:33
     **/
    @Select({"SELECT customer_id, customer_name, customer_stopMark, customer_createTime FROM customer_info"})
    @Results({
            @Result(column = "customer_id", property = "customerId", id = true),
            @Result(column = "customer_name", property = "customerName"),
            @Result(column = "customer_stopMark", property = "customerStopMark"),
            @Result(column = "customer_createTime", property = "customerCreateTime")
    })
    List<CustomerInfo> listAllCustomerInfo();

    /**
     * 查询客户列表
     *
     * @param type 参数 0启用 1停用 2查所有
     * @return 返回集合哦
     * @author wair0
     * @date 2019-05-03 14:33
     **/
    @Select({"SELECT customer_id, customer_name, customer_stopMark, customer_createTime FROM customer_info  where customer_stopMark = #{type} and 1=1 "})
    @Results({
            @Result(column = "customer_id", property = "customerId", id = true),
            @Result(column = "customer_name", property = "customerName"),
            @Result(column = "customer_stopMark", property = "customerStopMark"),
            @Result(column = "customer_createTime", property = "customerCreateTime")
    })
    List<CustomerInfo> listAllCustomerInfoByType(@Param(value = "type") Integer type);

    /**
     * 查询数据行数
     *
     * @param type 参数（用来判断是查所有信息还是查停用的、再用的医院信息列表）
     * @return java.lang.Integer 返回数据行数
     * @author admin
     * @date 2019-01-25 16:35
     **/
    @Select({"SELECT count(customer_id) FROM customer_info  WHERE customer_stopMark = #{type} AND 1=1 "})
    @Results({@Result(column = "customer_id", property = "customerId", id = true)})
    Integer countCustomer(@Param(value = "type") Integer type);


    /**
     * 修改医院信息列表
     *
     * @param customerInfo 医院实体
     * @return CustomerInfo 返回修改后的对象
     * @author LiWei
     * @date 2018-12-24 17:41
     **/
    @Update({"UPDATE customer_info SET customer_name = #{customerName},customer_stopMark = #{customerStopMark} WHERE customer_id=#{customerId}"})
    void updateCustomer(CustomerInfo customerInfo);


    /**
     * 删除医院信息
     *
     * @param customerId 医院编号
     * @author LiWei
     * @date 2018-12-24 17:42
     **/
    void deleteCustomer(Integer customerId);

    /**
     * 查询一个对象
     *
     * @param customerId 医院编号
     * @return CustomerInfo
     * @author LiWei
     * @date 2019-01-15 20:05
     **/
    @Select({"SELECT customer_id, customer_name, customer_stopMark, customer_createTime FROM customer_info where customer_id = #{customerId}"})
    @Results({
            @Result(column = "customer_id", property = "customerId", id = true),
            @Result(column = "customer_name", property = "customerName"),
            @Result(column = "customer_stopMark", property = "customerStopMark"),
            @Result(column = "customer_createTime", property = "customerCreateTime")
    })
    CustomerInfo findOneByCustomerId(@Param("customerId") Integer customerId);

    /**
     * 通过客户名来查询数量-->用来判断客户是否存在
     *
     * @param customerName 客户名
     * @return java.lang.Integer
     * @author admin
     * @date 2019-03-29 14:37
     **/
    @Select({"SELECT count(customer_id) FROM customer_info  WHERE customer_name = #{customerName}"})
    Integer countCustomerByName(@Param("customerName") String customerName);

    @Insert("INSERT INTO customer_info(customer_name,customer_stopMark) VALUES(#{customerName}, #{customerStopMark})")
    void addCustomer(CustomerInfo CustomerInfo);
}