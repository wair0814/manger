package cn.liwei08.server.impl;

import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.mapper.CustomerInfoMapper;
import cn.liwei08.server.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @className : CustomerInfoServiceImpl
 * @Description 客户信息管理
 * @author: Li Wei
 * @date: 2019-05-03 14:08
 * Version : 1.0
 **/
@Service
@Slf4j
public class CustomerInfoServiceImpl implements CustomerInfoService {
    @Autowired
    CustomerInfoMapper customerInfoMapper;


    @Override
    public CustomerInfo selectByPrimaryKey(Integer customerId) {
        return customerInfoMapper.findOneByCustomerId(customerId);
    }

    @Override
    public int updateByPrimaryKeySelective(CustomerInfo record) {
        return 0;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int updateByPrimaryKey(CustomerInfo record) {
        return 0;
    }


    /**
     * 查询所有的医院信息列表
     *
     * @param type --查询数据的标记信息
     * @return 返回所有的信息列表
     * @author LiWei
     * @date 2018-12-24 17:40
     **/
    @Override
    public List<CustomerInfo> listAllCustomerInfo(Integer type) {
        /*
         * 判断flag参数
         */
        List<CustomerInfo> infos = null;
        if (type == null) {
            infos = customerInfoMapper.listAllCustomerInfo();
        } else if (type == 0 || type == 1) {
            infos = customerInfoMapper.listAllCustomerInfoByType(type);
        } else {
            log.info("参数非法");
        }
        assert infos != null;
        log.info("--> Totle：" + infos.size());
        return infos;
    }

    @Override
    public Integer countCustomer(Integer type) {
        return customerInfoMapper.countCustomer(type);
    }

    @Override
    public Integer countCustomerByName(CustomerInfo customerInfo) {
        return customerInfoMapper.countCustomerByName(customerInfo.getCustomerName());
    }

    @Override
    public void addCustomer(CustomerInfo customerInfo) {
        log.info(customerInfo.toString());
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
    public CustomerInfo findOneByCustomerId(Integer customerId) {
        return customerInfoMapper.findOneByCustomerId(customerId);
    }

}
