package cn.liwei08.server.impl;

import cn.liwei08.MangerApplication;
import cn.liwei08.entity.CustomerInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MangerApplication.class})// 指定启动类
@Slf4j
public class CustomerInfoServiceImplTest {
    @Autowired
    private CustomerInfoServiceImpl CustomerInfoServiceImpl;

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listAllCustomerInfo() {
        int flag = 0;
        List<CustomerInfo> customerInfoList = CustomerInfoServiceImpl.listAllCustomerInfo(flag);
        log.info("--> Totle： " + customerInfoList.size());
        for (CustomerInfo customerInfo : customerInfoList) {
            log.info("--> 详细信息如下： " + customerInfo.toString());
        }
    }

    @Test
    public void countCustomer() {
    }

    @Test
    public void countCustomerByName() {
    }

    @Test
    public void addCustomer() {
    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void deleteCustomer() {
    }

    @Test
    public void findOneByCustomerId() {
    }
}