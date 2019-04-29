package cn.liwei08.mapper;

import cn.liwei08.entity.HospitalModular;

public interface HospitalModularMapper {
    int deleteByPrimaryKey(Integer modularId);

    int insert(HospitalModular record);

    int insertSelective(HospitalModular record);

    HospitalModular selectByPrimaryKey(Integer modularId);

    int updateByPrimaryKeySelective(HospitalModular record);

    int updateByPrimaryKey(HospitalModular record);
}