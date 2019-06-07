package cn.liwei08.server;

import cn.liwei08.entity.CustomerInfo;

import java.util.List;

/**
 * TODO
 *
 * @param
 * @author wair0
 * @return
 * @date 2019-05-03 14:07
 **/

@SuppressWarnings("ALL")
public interface CustomerInfoService {

    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    List<CustomerInfo> listAllCustomerInfo(int flag);

    /**
     * 通过flag参数来查询数据行数
     *
     * @param flag 参数（用来判断是查所有信息还是查停用的、再用的医院信息列表）
     * @return java.lang.Integer 返回数据行数
     * @author admin
     * @date 2019-01-25 16:39
     **/
    Integer countCustomer(Integer flag);


    /**
     *
     * 查询行数-->用来判断是否存在此客户
     *
     * @return java.lang.Integer
     * @param customerInfo 客户实体信息
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
    // , Integer hospitalId

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
    CustomerInfo findOneByCustomerId(CustomerInfo customerInfo);

}
