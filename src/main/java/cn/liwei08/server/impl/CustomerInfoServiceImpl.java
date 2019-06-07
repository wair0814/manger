package cn.liwei08.server.impl;

import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.mapper.CustomerInfoMapper;
import cn.liwei08.server.CustomerInfoService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    /**
     *
     */
    private final
    CustomerInfoMapper customerInfoMapper;

    private final Logger log = LoggerFactory.getLogger(CustomerInfoService.class);

    public CustomerInfoServiceImpl(CustomerInfoMapper customerInfoMapper) {
        this.customerInfoMapper = customerInfoMapper;
    }


    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return customerInfoMapper.deleteByPrimaryKey(customerId); }

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


    /**
     * 查询所有的医院信息列表
     *
     * @param flag --查询数据的标记信息
     * @return 返回所有的信息列表
     * @author LiWei
     * @date 2018-12-24 17:40
     **/
    @Override
    public List<CustomerInfo> listAllCustomerInfo(int flag) {
        return customerInfoMapper.listAllCustomerInfo(flag);
    }

    @Override
    public Integer countCustomer(Integer flag) {
        return customerInfoMapper.countCustomer(flag);
    }

    @Override
    public Integer countCustomerByName(CustomerInfo customerInfo) {
        return customerInfoMapper.countCustomerByName(customerInfo.getCustomerName());
    }

    @Override
    public void addCustomer(CustomerInfo customerInfo) {
        log.debug(customerInfo.toString());
        // 非空判断 customerInfo == null || StringUtils.isBlank(customerInfo.getCustomerName())
        if (StringUtils.isBlank(customerInfo.getCustomerName())) {
            log.error("参数非法，为空");
        } else {
            customerInfoMapper.addCustomer(customerInfo);
        }
    }

    @Override
    public void updateCustomer(CustomerInfo customerInfo) {
        customerInfoMapper.updateCustomer(customerInfo);
    }

    @Override
    public void deleteCustomer(Integer hospitalId) {

    }

    @Override
    public CustomerInfo findOneByCustomerId(CustomerInfo customerInfo) {
        if (customerInfo != null) {
            return customerInfoMapper.findOneByCustomerId(customerInfo.getCustomerId());
        } else {
            return null;
        }
    }

}
