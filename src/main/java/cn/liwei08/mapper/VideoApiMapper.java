package cn.liwei08.mapper;

import cn.liwei08.entity.VideoApi;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @className : VideoApiMapper
 * @Description 视频解析
 * @author: Li Wei
 * @date: 2019-03-11 09:11
 * Version : 1.0
 **/
@Repository
public interface VideoApiMapper {
    int deleteByPrimaryKey(Integer apiId);

    int insert(VideoApi record);

    int insertSelective(VideoApi record);

    VideoApi selectByPrimaryKey(Integer apiId);

    int updateByPrimaryKeySelective(VideoApi record);

    int updateByPrimaryKey(VideoApi record);

    @Select({"SELECT api_id,api_name,api_state,api_url,api_type FROM video_api"})
    @Results({
            @Result(column = "api_id", property = "apiId", id = true),
            @Result(column = "api_name", property = "apiName"),
            @Result(column = "api_state", property = "apiState"),
            @Result(column = "api_url", property = "apiUrl"),
            @Result(column = "api_type", property = "apiType")
    })
    List<VideoApi> listVideos();
}