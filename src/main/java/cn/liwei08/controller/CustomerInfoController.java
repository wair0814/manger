package cn.liwei08.controller;

import cn.liwei08.common.enums.ResultEnum;
import cn.liwei08.common.exception.ResultException;
import cn.liwei08.common.utils.ResultVoUtil;
import cn.liwei08.common.vo.ResultVo;
import cn.liwei08.entity.CustomerInfo;
import cn.liwei08.server.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @className : CustomerInfoController
 * @Description 客户信息管理
 * @author: Li Wei
 * @date: 2019-05-03 14:13
 * Version : 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/customer")
public class CustomerInfoController {
    @Autowired
    CustomerInfoService customerInfoService;

    /**
     * 查所有列表
     *
     * @param type 查询参数
     * @return java.lang.String
     * @author wair0
     * @date 2019-05-04 00:07
     **/
    @GetMapping("/listAllCustomer")
    public ResultVo listAllCustomer(Integer type) {
        List<CustomerInfo> listCustomerInfos = customerInfoService.listAllCustomerInfo(type);
        log.info(listCustomerInfos.toString());
        return ResultVoUtil.success(listCustomerInfos);
    }


    /**
     * 修改信息
     *
     * @param customerInfo 医院实体
     * @return void
     * @author admin
     * @date 2019-01-23 20:30
     **/
    @PostMapping("/updateCustomer")
    public ResultVo updateCustomer(CustomerInfo customerInfo) {
        /*
         * 非空判断
         */
        if (customerInfo.getCustomerName().isEmpty()) {
            throw new ResultException(ResultEnum.PARAM_NULL);
        } else {
            customerInfoService.updateCustomer(customerInfo);
            return ResultVoUtil.success("操作成功");
        }
    }

    /**
     * 添加客户实体信息
     *
     * @param customerInfo 客户实体对象
     * @return void
     * @author admin
     * @date 2019-04-03 16:13
     **/
    @PostMapping("addCustomerInfo")
    public ResultVo addCustomerInfo(CustomerInfo customerInfo) {
        if (customerInfo.getCustomerName().isEmpty()) {
            throw new ResultException(ResultEnum.PARAM_NULL);
        } else {
            customerInfoService.addCustomer(customerInfo);
            return ResultVoUtil.success("操作成功");
        }
    }

    /**
     * 检查是否存在相同名字的客户
     *
     * @param customerInfo 客户实体对象
     * @return void
     * @author admin
     * @date 2019-04-03 16:13
     **/
    @GetMapping("checkCustomer")
    public ResultVo checkCustomer(CustomerInfo customerInfo) {
        if (customerInfo.getCustomerName().isEmpty()) {
            throw new ResultException(ResultEnum.PARAM_NULL);
        } else {
            // 获得行数
            Integer countCustomer = customerInfoService.countCustomerByName(customerInfo);
            return ResultVoUtil.success(countCustomer);
        }
    }

    @RequestMapping("findOneByCustomerId")
    public ResultVo findOneByCustomerId(Integer id) {
        if (id == null) {
            log.warn("id为空");
            throw new ResultException(ResultEnum.PARAM_NULL);
        } else {
            CustomerInfo customerInfo = customerInfoService.findOneByCustomerId(id);
            return ResultVoUtil.success(customerInfo);
        }
    }
}
