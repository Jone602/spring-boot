package com.feng.springboot.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {
    //解析请求语言
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的参数
        String language = request.getParameter("l");
        //如果没有就是用默认的地区
        Locale locale = Locale.getDefault();
        //如果请求的参数不为空
        if (!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            //国家地区
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
