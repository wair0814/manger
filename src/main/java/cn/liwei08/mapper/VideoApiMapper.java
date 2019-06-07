package cn.liwei08.mapper;

import cn.liwei08.entity.VideoApi;

import java.util.List;
/**
 * @className : VideoApiMapper
 * @Description 视频解析
 * @author: Li Wei
 * @date: 2019-03-11 09:11
 * Version : 1.0
 **/
public interface VideoApiMapper {
    int deleteByPrimaryKey(Integer apiId);

    int insert(VideoApi record);

    int insertSelective(VideoApi record);

    VideoApi selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(VideoApi record);

    int updateByPrimaryKey(VideoApi record);

    List<VideoApi> listVideos();
}