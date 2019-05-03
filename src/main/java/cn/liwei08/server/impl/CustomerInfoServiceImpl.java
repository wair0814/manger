package cn.liwei08.server.impl;

import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.mapper.CustomerInfoMapper;
import cn.liwei08.server.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className : CustomerInfoServiceImpl
 * @Description 客户信息管理
 * @author: Li Wei
 * @date: 2019-05-03 14:08
 * Version : 1.0
 **/
@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    CustomerInfoMapper customerInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return customerInfoMapper.deleteByPrimaryKey(customerId);
    }

    @Override
    public int insert(CustomerInfo record) {
        return customerInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CustomerInfo record) {
        return 0;
    }

    @Override
    public CustomerInfo selectByPrimaryKey(Integer customerId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CustomerInfo record) {
        return 0;
    }

    @Override
    public List<CustomerInfo> listAllCustomerInfo() {
        return customerInfoMapper.listAllCustomerInfo();
    }
}
