package cn.liwei08.controller;

import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.server.CustomerInfoService;
import cn.liwei08.util.JsonUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
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
    /**
     * service层方法
     */
    private final
    CustomerInfoService customerInfoService;

    public CustomerInfoController(CustomerInfoService customerInfoService) {
        this.customerInfoService = customerInfoService;
    }

    /**
     * 查所有列表
     *
     * @param flag 查询参数
     * @return java.lang.String
     * @author wair0
     * @date 2019-05-04 00:07
     **/
    @RequestMapping("/listAllCustomer")
    public @ResponseBody
    String listAllCustomer(Integer flag) {
        if (flag == null) {
            return "请输入查询参数";
        } else {
            List<CustomerInfo> listCustomerInfos = customerInfoService.listAllCustomerInfo(flag);
            JSONArray customerInfos = JSONArray.parseArray(JSON.toJSONString(listCustomerInfos));
            log.info(customerInfos.toJSONString());
            return customerInfos.toJSONString();
        }
    }


    /**
     * 修改信息
     *
     * @param customerInfo 医院实体
     * @return void
     * @author admin
     * @date 2019-01-23 20:30
     **/
    @RequestMapping("/updateCustomer")
    public void updateHospital(CustomerInfo customerInfo) {
        customerInfoService.updateCustomer(customerInfo);
    }

    /**
     * 添加客户实体信息
     *
     * @param response, customerInfo 客户实体对象
     * @return void
     * @author admin
     * @date 2019-04-03 16:13
     **/
    @RequestMapping("addCustomerInfo")
    public void addCustomerInfo(HttpServletResponse response, CustomerInfo customerInfo) {
        customerInfoService.addCustomer(customerInfo);
        JSONObject object = new JSONObject();
        object.put("state", "200");
        JsonUtil.outJsonString(response, object.toString());
    }

    /**
     * 检查是否存在相同名字的客户
     *
     * @param response 发送, customerInfo 客户实体对象
     * @return void
     * @author admin
     * @date 2019-04-03 16:13
     **/
    @RequestMapping("checkCustomer")
    public void checkCustomer(HttpServletResponse response, CustomerInfo customerInfo) {
        JSONObject checkCustomerMsg = new JSONObject();
        if (customerInfo.getCustomerName().isEmpty()) {
            checkCustomerMsg.put("msg_checkCustomer", "404");
        } else {
            // 获得行数
            Integer countCustomer = customerInfoService.countCustomerByName(customerInfo);
            checkCustomerMsg.put("msg_checkCustomer", countCustomer);
        }
        log.debug(checkCustomerMsg.toString());
        JsonUtil.outJsonString(response, checkCustomerMsg.toString());
    }
}
