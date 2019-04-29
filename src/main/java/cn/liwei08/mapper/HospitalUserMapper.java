package cn.liwei08.mapper;

import cn.liwei08.entity.HospitalUser;

public interface HospitalUserMapper {
    int deleteByPrimaryKey(Long hospitalUserId);

    int insert(HospitalUser record);

    int insertSelective(HospitalUser record);

    HospitalUser selectByPrimaryKey(Long hospitalUserId);

    int updateByPrimaryKeySelective(HospitalUser record);

    int updateByPrimaryKey(HospitalUser record);
}