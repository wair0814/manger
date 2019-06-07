package cn.liwei08.controller;

import cn.liwei08.entity.VideoApi;
import cn.liwei08.server.VideoApiService;
import cn.liwei08.util.HttpClientUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className : VideoController
 * @Description 视频解析
 * @author: Li Wei
 * @date: 2019-05-04 22:53
 * Version : 1.0
 **/

@RestController
@RequestMapping("/video")
public class VideoController {

    private Logger log = LoggerFactory.getLogger(ApiController.class);

    private final
    VideoApiService videoApiService;

    public VideoController(VideoApiService videoApiService) {
        this.videoApiService = videoApiService;
    }


    /**
     * 获取所有的视频解析接口__by个人的
     *
     * @return java.lang.String
     * @author wair0
     * @date 2019-05-02 17:01
     **/
    @RequestMapping("/")
    public String getAllVideoApis() {
        List<VideoApi> listVideoApi = videoApiService.listVideos();
        log.info("后台查到的数据为 ==>" + listVideoApi.toString());
        JSONArray videoApis = JSONArray.parseArray(JSON.toJSONString(listVideoApi));
        log.info(videoApis.toJSONString());
        return videoApis.toJSONString();
    }

    /**
     * 获取所有的视频解析接口__by其他网站
     *
     * @return 返回json字符串
     * @author wair0
     * @date 2019-05-02 17:01
     **/
    @RequestMapping("/getAllVideosByJson")
    public String getAllVideosByJson() {
        final String baseUrl = "https://coding.net/u/Gold2River/p/NetRaw/git/raw/master/videoRule_541.json";
        String jsonListAllFreeUrl;
        jsonListAllFreeUrl = HttpClientUtil.doGet(baseUrl);
        return jsonListAllFreeUrl;
    }
}
