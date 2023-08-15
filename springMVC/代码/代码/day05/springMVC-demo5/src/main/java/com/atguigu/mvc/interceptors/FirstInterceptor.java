package com.atguigu.mvc.interceptors;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date:2021/7/10
 * Author:ybc
 * Description:
 */
@Component//将对象交给IOC容器，又因为是普通组件，所以使用Component
public class FirstInterceptor implements HandlerInterceptor {

    @Override
    /**
     * 控制器controller执行之前执行
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("FirstInterceptor-->preHandle");
        //返回false是拦击
        return true;
    }

    @Override
    /**
     * 控制器controller执行之后执行
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("FirstInterceptor-->postHandle");
    }

    @Override
    /**
     *页面渲染之后执行
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("FirstInterceptor-->afterCompletion");
    }
}
