package cn.liwei08.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.liwei08.entity.VideoApi;
import cn.liwei08.server.VideoApiService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.liwei08.util.HttpClientUtil;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
    private Logger log = LoggerFactory.getLogger(APIController.class);

    @Autowired
    private VideoApiService videoApiService;

    /**
     * Cat，即类型。提交不同的参数代表不同的类别，具体： a Anime - 动画 b Comic – 漫画 c Game – 游戏 d Novel – 小说
     * e Myself – 原创 f Internet – 来自网络 g Other – 其他
     *
     * @param type
     * @return
     */
    @RequestMapping("/yiYan")
    @ResponseBody
    public String yiYan(String type) {
//		System.out.println(type);
        String yiYanJson;
        final String baseUrl = "https://v1.hitokoto.cn";
        Map<String, String> map = new HashMap<>(16);
        map.put("c", type);
        map.put("encode", "json");
        map.put("charset", "utf-8");
        yiYanJson = HttpClientUtil.doGet(baseUrl, map);
        return yiYanJson;
    }

    @RequestMapping("/getAllVideosByJson")
    public String getAllVideosByJson() {
        final String baseUrl = "https://coding.net/u/Gold2River/p/NetRaw/git/raw/master/videoRule_541.json";
        String jsonListAllFreeUrl;
        jsonListAllFreeUrl = HttpClientUtil.doGet(baseUrl);
        return jsonListAllFreeUrl;
    }

    @RequestMapping("/getAllVideoApis")
    public String getAllVideoApis() {
        List<VideoApi> listVideoApi = videoApiService.listVideos();
        log.info("后台查到的数据为 ==>" + listVideoApi.toString());
        JSONArray videoApis = JSONArray.parseArray(JSON.toJSONString(listVideoApi));
        log.info(videoApis.toJSONString());
        return videoApis.toJSONString();
    }

}
