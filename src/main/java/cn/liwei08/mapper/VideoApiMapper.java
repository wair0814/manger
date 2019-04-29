package cn.liwei08.mapper;

import cn.liwei08.entity.VideoApi;

import java.util.List;

public interface VideoApiMapper {
    int deleteByPrimaryKey(Integer apiId);

    int insert(VideoApi record);

    int insertSelective(VideoApi record);

    VideoApi selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(VideoApi record);

    int updateByPrimaryKey(VideoApi record);

    List<VideoApi> listVideos();
}