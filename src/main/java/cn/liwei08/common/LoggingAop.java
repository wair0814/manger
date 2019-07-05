package cn.liwei08.common;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @className : LoggingAop
 * @Description 记录日志aop
 * @author: Li Wei
 * @date: 2019-07-03 15:34
 * Version : 1.0
 **/
// @Component把切面类加入到IOC容器中
// @Aspect定义为切面类
@Component
@Aspect
@Slf4j
public class LoggingAop {


    /**
     * 定义切入点，切入点为com.example.aop下的所有函数
     */
    @Pointcut("execution(* cn.liwei08.server.*.*(..)))")
    public void webLog() {

    }

    private long begin = 0;
    private Signature signature;

    /**
     * 定义默认日期显示格式
     */
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 前置通知：在连接点之前执行的通知
     */
    @Before("webLog()")
    public void doBeforce(JoinPoint joinPoint) {
        log.info("--> <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //用的最多 通知的签名
        signature = joinPoint.getSignature();
        begin = System.currentTimeMillis();
        Object[] args = joinPoint.getArgs();
        log.info("--> 开始时间: " + dateFormat.format(new Date()));
        log.info("--> 前置通知method: " + "【" + signature.getName() + "】");
        log.info("--> 参数列表: " + Arrays.asList(args));
    }

    @After("webLog()")
    public void doAfter(JoinPoint joinPoint) {
        long end = System.currentTimeMillis();
        signature = joinPoint.getSignature();
        log.info("--> 后置通知method: " + "【" + signature.getName() + "】" + " ==> 共用时：" + (end - begin) + "ms");
        log.info("--> 结束时间: " + dateFormat.format(new Date()));
        log.info("--> >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
