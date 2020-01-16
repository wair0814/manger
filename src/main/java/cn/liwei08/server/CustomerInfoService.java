package cn.liwei08.server;

import cn.liwei08.entity.CustomerInfo;

import java.util.List;

/**
 * T客户管理service层
 *
 * @param
 * @author LiWei
 * @return
 * @date 2019-05-03 14:07
 **/

public interface CustomerInfoService {

    /**
     * 通过客户主键id进行查找单条实体数据
     *
     * @param customerId 客户id
     * @param
     * @return
     * @author Li Wei
     * @date 2019-06-20 17:34
     **/
    CustomerInfo selectByPrimaryKey(Integer customerId);

    /**
     * 修改客户数据
     *
     * @param record 客户实体信息
     * @return
     * @author Li Wei
     * @date 2019-06-20 17:34
     **/
    int updateByPrimaryKeySelective(CustomerInfo record);

    /**
     * 修改客户数据
     *
     * @param record 客户实体信息
     * @return
     * @author Li Wei
     * @date 2019-06-20 17:34
     **/
    int updateByPrimaryKey(CustomerInfo record);

    /**
     * 通过类型来查找所有的客户信息
     *
     * @param flag 参数类型
     * @return
     * @author Li Wei
     * @date 2019-06-20 17:34
     **/
    List<CustomerInfo> listAllCustomerInfo(Integer  type);

    /**
     * 通过flag参数来查询数据行数
     *
     * @param flag 参数（用来判断是查所有信息还是查停用的、再用的医院信息列表）
     * @return java.lang.Integer 返回数据行数
     * @author admin
     * @date 2019-01-25 16:39
     **/
    Integer countCustomer(Integer type);


    /**
     * 查询行数-->用来判断是否存在此客户
     *
     * @param customerInfo 客户实体信息
     * @return java.lang.Integer
     * @author admin
     * @date 2019-03-29 14:42
     **/
    Integer countCustomerByName(CustomerInfo customerInfo);

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
     *                     //     * @param hospitalId   医院编号
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
     * hospitalInfo对象 通过id查hospitalInfo对象
     *
     * @param customerInfo
     * @return CustomerInfo
     * @author LiWei
     * @date 2019-01-15 20:05
     **/
    CustomerInfo findOneByCustomerId(Integer customerId);

}
