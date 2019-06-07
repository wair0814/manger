package cn.liwei08.mapper;

import cn.liwei08.entity.SysType;

public interface SysTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(SysType record);

    int insertSelective(SysType record);

    SysType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(SysType record);

    int updateByPrimaryKey(SysType record);
}