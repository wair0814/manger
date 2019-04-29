package cn.liwei08.mapper;

import cn.liwei08.entity.SysDetail;

public interface SysDetailMapper {
    int deleteByPrimaryKey(Long detailNo);

    int insert(SysDetail record);

    int insertSelective(SysDetail record);

    SysDetail selectByPrimaryKey(Long detailNo);

    int updateByPrimaryKeySelective(SysDetail record);

    int updateByPrimaryKeyWithBLOBs(SysDetail record);

    int updateByPrimaryKey(SysDetail record);
}