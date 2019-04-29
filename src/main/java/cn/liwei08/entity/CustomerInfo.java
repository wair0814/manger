package cn.liwei08.entity;

import java.util.Date;

public class CustomerInfo {
    private Integer customerId;

    private String customerName;

    private Integer customerStopmark;

    private Date customerCreatetime;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerStopmark() {
        return customerStopmark;
    }

    public void setCustomerStopmark(Integer customerStopmark) {
        this.customerStopmark = customerStopmark;
    }

    public Date getCustomerCreatetime() {
        return customerCreatetime;
    }

    public void setCustomerCreatetime(Date customerCreatetime) {
        this.customerCreatetime = customerCreatetime;
    }
}