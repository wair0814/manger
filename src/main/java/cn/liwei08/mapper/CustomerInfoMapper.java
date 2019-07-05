package cn.liwei08.mapper;

import cn.liwei08.entity.CustomerInfo;
import org.apache.ibatis.annotations.Param;
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
     * 通过ID删除一条数据
     *
     * @param customerId -- 客户id
     * @return int
     * @author Li Wei
     * @date 2019-05-05 11:32
     **/
    int deleteByPrimaryKey(Integer customerId);

    /**
     * 添加客户信息
     *
     * @param record 客户实体信息
     * @return int
     * @author Li Wei
     * @date 2019-05-05 11:33
     **/
    int insert(CustomerInfo record);

    /**
     * 插入已选择的实体信息
     *
     * @param record 实体
     * @return int
     * @author Li Wei
     * @date 2019-05-05 11:34
     **/
    int insertSelective(CustomerInfo record);

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
     * TODO
     *
     * @param record
     * @return
     * @author Li Wei
     * @date 2019-05-05 11:34
     **/
    int updateByPrimaryKeySelective(CustomerInfo record);

    /**
     * TODO
     *
     * @param record
     * @return
     * @author Li Wei
     * @date 2019-05-05 11:34
     **/
    int updateByPrimaryKey(CustomerInfo record);

    /**
     * 查询客户列表
     *
     * @param flag 参数 0启用 1停用 2查所有
     * @return 返回集合哦
     * @author wair0
     * @date 2019-05-03 14:33
     **/
    List<CustomerInfo> listAllCustomerInfo(@Param(value = "flag") int flag);

    /**
     * 查询数据行数
     *
     * @param flag 参数（用来判断是查所有信息还是查停用的、再用的医院信息列表）
     * @return java.lang.Integer 返回数据行数
     * @author admin
     * @date 2019-01-25 16:35
     **/

    Integer countCustomer(@Param(value = "flag") Integer flag);

    /**
     * 添加医院名称
     *
     * @param customerInfo 医院实体
     * @return CustomerInfo
     * @author LiWei
     * @date 2018-12-24 17:41
     **/
    void addCustomer(CustomerInfo customerInfo);

    /**
     * 修改医院信息列表
     *
     * @param customerInfo 医院实体
     * @return CustomerInfo 返回修改后的对象
     * @author LiWei
     * @date 2018-12-24 17:41
     **/
    void updateCustomer(CustomerInfo customerInfo);


    /**
     * 删除医院信息
     *
     * @param customerId 医院编号
     * @return
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
    CustomerInfo findOneByCustomerId(Integer customerId);

    /**
     * 通过客户名来查询数量-->用来判断客户是否存在
     *
     * @param customerName 客户名
     * @return java.lang.Integer
     * @author admin
     * @date 2019-03-29 14:37
     **/
    Integer countCustomerByName(String customerName);
}