package cn.liwei08.entity;

import java.util.Date;

public class SysDetail {
    private Long detailNo;

    private Integer hospitalInfo;

    private Integer hospitalRoomInfo;

    private Integer levelInfo;

    private Integer detailTypeInfo;

    private Integer detailUserInfo;

    private Date createTime;

    private Date updateTime;

    private String detailInfo;

    public Long getDetailNo() {
        return detailNo;
    }

    public void setDetailNo(Long detailNo) {
        this.detailNo = detailNo;
    }

    public Integer getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(Integer hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }

    public Integer getHospitalRoomInfo() {
        return hospitalRoomInfo;
    }

    public void setHospitalRoomInfo(Integer hospitalRoomInfo) {
        this.hospitalRoomInfo = hospitalRoomInfo;
    }

    public Integer getLevelInfo() {
        return levelInfo;
    }

    public void setLevelInfo(Integer levelInfo) {
        this.levelInfo = levelInfo;
    }

    public Integer getDetailTypeInfo() {
        return detailTypeInfo;
    }

    public void setDetailTypeInfo(Integer detailTypeInfo) {
        this.detailTypeInfo = detailTypeInfo;
    }

    public Integer getDetailUserInfo() {
        return detailUserInfo;
    }

    public void setDetailUserInfo(Integer detailUserInfo) {
        this.detailUserInfo = detailUserInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }
}