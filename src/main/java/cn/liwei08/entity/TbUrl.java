package cn.liwei08.entity;

import lombok.Data;

/**
 * @className : TbUrl
 * @Description 所有的视频地址列表
 * @author: Li Wei
 * @date: 2019-06-18 21:11
 * Version : 1.0
 **/
@Data
public class TbUrl {
    private Integer id;

    private String baseUrl;

    private String chapterFind;

    private Boolean forFearch;

    private String movieFind;

    private String pinYinTitle;

    private String searchFind;

    private String searchUrl;

    private String title;

    private Long weight;
}
