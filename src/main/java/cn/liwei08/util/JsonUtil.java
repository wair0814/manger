package cn.liwei08.util;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author liwei
 */
public class JsonUtil {


    public static void outJsonString(HttpServletResponse response, String json) {
        response.setCharacterEncoding("UTF-8");
        // 使用text/plain的目的是兼容旧版浏览器，在页面需要用eval进行转换
        response.setContentType("text/plain;charset=UTF-8");
        // 设置页面不缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        // 在代理服务器端防止缓冲
        response.setDateHeader("expires", 0L);
        try {
            PrintWriter out = response.getWriter();
            out.write(json);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}