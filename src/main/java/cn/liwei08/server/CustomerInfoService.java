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

public interface CustomerInfoService {

    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    List<CustomerInfo> listAllCustomerInfo();

}
