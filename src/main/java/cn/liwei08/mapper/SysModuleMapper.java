package cn.liwei08.mapper;

import cn.liwei08.entity.SysModule;

public interface SysModuleMapper {
    int deleteByPrimaryKey(Integer moduleNo);

    int insert(SysModule record);

    int insertSelective(SysModule record);

    SysModule selectByPrimaryKey(Integer moduleNo);

    int updateByPrimaryKeySelective(SysModule record);

    int updateByPrimaryKey(SysModule record);
}