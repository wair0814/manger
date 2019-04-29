package cn.liwei08.mapper;

import cn.liwei08.entity.HospitalModularType;

public interface HospitalModularTypeMapper {
    int deleteByPrimaryKey(Integer hospitalModularTypeNo);

    int insert(HospitalModularType record);

    int insertSelective(HospitalModularType record);

    HospitalModularType selectByPrimaryKey(Integer hospitalModularTypeNo);

    int updateByPrimaryKeySelective(HospitalModularType record);

    int updateByPrimaryKey(HospitalModularType record);
}