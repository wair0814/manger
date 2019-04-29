package cn.liwei08.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className : toUrlController
 * @Description 页面跳转用的
 * @author: Li Wei
 * @date: 2019-02-23 13:32
 * Version : 1.0
 **/
@Controller
public class ToolsController {

    @RequestMapping("tool_Index")
    public String toolIndex() {
        System.out.println("__________");
        return "/tool/toolsInfo";
    }
}
