package cn.liwei08.controller;

import cn.liwei08.util.HttpClientUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有的API集中的Controlle
 *
 * @author wair0
 * @date 2019-05-02 17:00
 **/
@RequestMapping("/API")
@RestController
public class ApiController {
    private Logger log = LoggerFactory.getLogger(ApiController.class);


    /**
     * Cat，即类型。提交不同的参数代表不同的类别，具体： a Anime - 动画 b Comic – 漫画 c Game – 游戏 d Novel – 小说
     * e Myself – 原创 f Internet – 来自网络 g Other – 其他
     *
     * @param type 获取一言信息的格式
     * @return 返回json字符串
     */
    @RequestMapping("/yiYan")
    public @ResponseBody
    String yiYan(String type) {
        final String yiyanHost = "https://v1.hitokoto.cn";
        String yiYanJson;
        Map<String, String> map = new HashMap<>(16);
        map.put("c", type);
        map.put("encode", "json");
        map.put("charset", "utf-8");
        yiYanJson = HttpClientUtil.doGet(yiyanHost, map);
        return yiYanJson;
    }

    /**
     * 获取天气信息
     * //    @RequestMapping(value = "/weather", method = RequestMethod.POST)
     *
     * @return 为
     * @Param city 城市
     * @Author LiWei
     * @Date 2018-12-11 21:11
     **/
    @PostMapping(value = "/weather")
    public @ResponseBody
    String getWeatherByXinZhiWeather(String ip) {
        log.info("getWeatherByXinZhiWeather 用户的ip地址为 ==>" + ip);
        final String ipCheck = "\\d+\\.\\d+\\.\\d+\\.\\d+";

        //api地址
        final String xinZhiHost = "https://api.seniverse.com/v3/weather/now.json";
        //密钥
        String key = "bh10yiht3xubp3fg";
        String weatherInfo;
        if (StringUtils.isEmpty(ip) || StringUtils.isBlank(ip)) {
            return "IP地址为空";
        } else if (!ip.matches(ipCheck)) {
            return "IP地址非法";
        } else {
            Map<String, String> map = new HashMap<>(16);
            map.put("key", key);
            map.put("location", ip);
            map.put("language", "zh-Hans");
            map.put("unit", "c");
            weatherInfo = HttpClientUtil.doGet(xinZhiHost, map);
            if (weatherInfo.isEmpty()) {
                return "未查询到此地天气信息";
            }
            log.info("XinZhiWeather ==>" + weatherInfo);
            return weatherInfo;
        }
    }
}
