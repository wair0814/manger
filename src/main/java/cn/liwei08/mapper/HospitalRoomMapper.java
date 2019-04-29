package cn.liwei08.mapper;

import cn.liwei08.entity.HospitalRoom;

public interface HospitalRoomMapper {
    int deleteByPrimaryKey(Integer roomNo);

    int insert(HospitalRoom record);

    int insertSelective(HospitalRoom record);

    HospitalRoom selectByPrimaryKey(Integer roomNo);

    int updateByPrimaryKeySelective(HospitalRoom record);

    int updateByPrimaryKey(HospitalRoom record);
}