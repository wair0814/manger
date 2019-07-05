package cn.liwei08.mapper;

import cn.liwei08.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @author Li Wei
 * @description //员工管理接口
 * @date 2018-10-11 22:15
 **/
@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}