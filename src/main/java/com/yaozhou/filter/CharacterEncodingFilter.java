package com.yaozhou.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/6/17 17:20
 * Desc：
 */
public class CharacterEncodingFilter implements Filter {
    //在web服务器启动时就开始初始化，随时监听
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化");

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("CharacterEncodingFilter执行前。。。。。。");
        //让我们的程序继续走，如果不写，程序到这里就被拦截不走
        chain.doFilter(request,response);
        System.out.println("CharacterEncodingFilter执行后。。。。。。");
    }

    public void destroy() {
        System.out.println("销毁CharacterEncodingFilter过滤器");

    }
}
