package cn.liwei08.mapper;

import cn.liwei08.entity.CustomerInfo;

import java.util.List;

public interface CustomerInfoMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    List<CustomerInfo> listAllCustomerInfo();
}