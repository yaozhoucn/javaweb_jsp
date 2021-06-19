package com.yaozhou.filter;

import com.yaozhou.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/6/19 9:32
 * @author HANG
 */
public class SysFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        if (request.getSession().getAttribute(Constant.USER_SESSION) == null){
            response.sendRedirect("../error.jsp");
        }
        chain.doFilter(req,resp);
    }

    public void destroy() {

    }
}