package cn.liwei08.mapper;

import cn.liwei08.entity.SysReportLevel;

public interface SysReportLevelMapper {
    int deleteByPrimaryKey(Integer levelId);

    int insert(SysReportLevel record);

    int insertSelective(SysReportLevel record);

    SysReportLevel selectByPrimaryKey(Integer levelId);

    int updateByPrimaryKeySelective(SysReportLevel record);

    int updateByPrimaryKey(SysReportLevel record);
}