package cn.liwei08.server.impl;

import cn.liwei08.entity.TbUrl;
import cn.liwei08.mapper.TbUrlMapper;
import cn.liwei08.server.TburlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className : TburlServiceImpl
 * @Description 所有视频地址数据列表
 * @author: Li Wei
 * @date: 2019-06-18 21:18
 * Version : 1.0
 **/
@Service
@Slf4j
public class TburlServiceImpl implements TburlService {
    @Autowired
    TbUrlMapper tbUrlMapper;

    @Override
    public List<TbUrl> queryTbUrl() {
        List<TbUrl> tbUrls = tbUrlMapper.queryTbUrl();
        log.info("totleSize: " + tbUrls.size() + " data:" + tbUrls.toString());
        return tbUrls;
    }
}
