package com.feng.springboot.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆成功后，应该已经在Session中，存在了用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser==null){//没有登陆过
            request.setAttribute("msg","没有登陆过。不能直接访问后台");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }else {
        return true;
    }
    }

}
