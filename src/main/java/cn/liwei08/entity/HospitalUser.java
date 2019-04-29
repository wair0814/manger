package cn.liwei08.entity;

public class HospitalUser {
    private Long hospitalUserId;

    private String hospitalUserName;

    private String hospitalUserPhone;

    private Integer hospitalUserStopmark;

    private Integer hospitalInfo;

    public Long getHospitalUserId() {
        return hospitalUserId;
    }

    public void setHospitalUserId(Long hospitalUserId) {
        this.hospitalUserId = hospitalUserId;
    }

    public String getHospitalUserName() {
        return hospitalUserName;
    }

    public void setHospitalUserName(String hospitalUserName) {
        this.hospitalUserName = hospitalUserName;
    }

    public String getHospitalUserPhone() {
        return hospitalUserPhone;
    }

    public void setHospitalUserPhone(String hospitalUserPhone) {
        this.hospitalUserPhone = hospitalUserPhone;
    }

    public Integer getHospitalUserStopmark() {
        return hospitalUserStopmark;
    }

    public void setHospitalUserStopmark(Integer hospitalUserStopmark) {
        this.hospitalUserStopmark = hospitalUserStopmark;
    }

    public Integer getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(Integer hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }
}