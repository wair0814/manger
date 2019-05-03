package cn.liwei08.controller;

import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.server.CustomerInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className : CustomerInfoController
 * @Description 客户信息管理
 * @author: Li Wei
 * @date: 2019-05-03 14:13
 * Version : 1.0
 **/
@RestController
public class CustomerInfoController {


    private Logger log = LoggerFactory.getLogger(CustomerInfoController.class);
    @Autowired
    CustomerInfoService CustomerInfoService;

    @RequestMapping("/listAllCustomer")
    public String listAllCustomer() {
        List<CustomerInfo> listCustomerInfos = CustomerInfoService.listAllCustomerInfo();
        JSONArray customerInfos = JSONArray.parseArray(JSON.toJSONString(listCustomerInfos));
        log.info(customerInfos.toJSONString());
        return customerInfos.toJSONString();

    }
}
