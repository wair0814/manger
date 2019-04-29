package cn.liwei08.server;

import cn.liwei08.entity.VideoApi;

import java.util.List;

/**
 * @className : VideoApiMapper
 * @Description 视频解析
 * @author: Li Wei
 * @date: 2019-03-11 09:11
 * Version : 1.0
 **/
public interface VideoApiService {
    /**
     *
     * 获取到所有的列表信息
     *
     * @return java.util.List<cn.liwei08.entity.VideoApi>
     * @param
     * @author liwei
     * @date 2019-04-09 20:52
     **/
    List<VideoApi> listVideos();

    int deleteByPrimaryKey(Integer apiId);

    int insert(VideoApi record);

    int insertSelective(VideoApi record);

    VideoApi selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(VideoApi record);

    int updateByPrimaryKey(VideoApi record);

}


