package cn.liwei08.mapper;

import cn.liwei08.entity.TbUrl;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TbUrlMapper {
    List<TbUrl> queryTbUrl();
}