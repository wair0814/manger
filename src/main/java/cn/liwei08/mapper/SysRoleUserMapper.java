package cn.liwei08.mapper;

import cn.liwei08.entity.SysRoleUser;

public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer roleUserNo);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer roleUserNo);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}