package cn.liwei08.entity;

public class HospitalRoom {
    private Integer roomNo;

    private String roomName;

    private Integer roomType;

    private Integer hospitalInfo;

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Integer getHospitalInfo() {
        return hospitalInfo;
    }

    public void setHospitalInfo(Integer hospitalInfo) {
        this.hospitalInfo = hospitalInfo;
    }
}