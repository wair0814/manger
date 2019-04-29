package cn.liwei08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className : UrlPathController
 * @Description 页面跳转用
 * @author: Li Wei
 * @date: 2019-04-27 19:11
 * Version : 1.0
 **/
@Controller
public class UrlPathController {
    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }
}
