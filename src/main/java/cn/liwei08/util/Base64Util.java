package cn.liwei08.util;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

/**
 * @param
 * @author Li Wei
 * @description // 加密用户密码
 * @date 2018-11-18 12:28
 * @return
 **/
public class Base64Util {


    private static String uuid;
    private static String cpwd;

    /**
     * 生成UUID
     *
     * @param
     */
    public static String getUUID() {
        uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }

    public static String setUserPwd(String userPwd) {
    Logger log =  LogManager.getLogger(Base64Util.class);
//        if (userPwd != null) {
        final Base64.Encoder encoder = Base64.getEncoder();
        final byte[] textByte = userPwd.getBytes(StandardCharsets.UTF_8);
        cpwd = encoder.encodeToString(textByte);
        StringBuilder userCpwd = new StringBuilder();
        userCpwd.append(cpwd);
        userCpwd.append(uuid);
        log.debug(userCpwd.toString());
        return userCpwd.toString();
//        } else {
//            log.info("错误");
//        }

    }


    public static String getUserPwd(String userPwd) {
        if (userPwd == null) {

            return null;
        } else {
            // 用来接收加密后的密码
            String uCpwd = null;
            final Base64.Encoder encoder = Base64.getEncoder();
            final byte[] textByte;
            textByte = userPwd.getBytes(StandardCharsets.UTF_8);
            uCpwd = encoder.encodeToString(textByte);
            return uCpwd;
        }
    }

}
