package cn.liwei08.server.impl;

import cn.liwei08.entity.VideoApi;
import cn.liwei08.mapper.VideoApiMapper;
import cn.liwei08.server.VideoApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @className : VideoApiServiceImpl
 * @Description 视频解析api
 * @author: Li Wei
 * @date: 2019-03-11 09:22
 * Version : 1.0
 **/
@Service
public class VideoApiServiceImpl implements VideoApiService {
    @Autowired
    private VideoApiMapper videoApiMapper;


    @Override
    public List<VideoApi> listVideos() {
        return videoApiMapper.listVideos();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Integer apiId) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(VideoApi record) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(VideoApi record) {
        return 0;
    }

    @Override
    public VideoApi selectByPrimaryKey(Integer apiId) {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKeySelective(VideoApi record) {
        return 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(VideoApi record) {
        return 0;
    }
}
