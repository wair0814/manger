package cn.liwei08.controller;

import cn.liwei08.common.utils.ResultVoUtil;
import cn.liwei08.common.vo.ResultVo;
import cn.liwei08.entity.TbUrl;
import cn.liwei08.entity.VideoApi;
import cn.liwei08.server.TburlService;
import cn.liwei08.server.VideoApiService;
import cn.liwei08.util.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@Slf4j
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    VideoApiService videoApiService;

    @Autowired
    TburlService tburlService;

    /**
     * 获取所有的视频解析接口__by个人的
     *
     * @return java.lang.String
     * @author wair0
     * @date 2019-05-02 17:01
     **/
    @RequestMapping("/")
    public ResultVo getAllVideoApis() {
        List<VideoApi> listVideoApi = videoApiService.listVideos();
        log.info("后台查到的数据为 ==>" + listVideoApi.toString());
        return ResultVoUtil.success(listVideoApi);
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
        String jsonListAllFreeUrl = HttpClientUtil.doGet(baseUrl);
        log.info(jsonListAllFreeUrl);
        return jsonListAllFreeUrl;
    }


    @GetMapping("queryTbUrl")
    public ResultVo queryTbUrl() {
        List<TbUrl> tbUrlList = tburlService.queryTbUrl();
        return ResultVoUtil.success(tbUrlList);
    }
}
