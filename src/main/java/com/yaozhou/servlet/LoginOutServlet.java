package com.yaozhou.servlet;

import com.yaozhou.util.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/6/19 10:06
 * @author HANG
 */
public class LoginOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object user_session = req.getSession().getAttribute(Constant.USER_SESSION);
        if (user_session != null){
            req.getSession().removeAttribute(Constant.USER_SESSION);
            resp.sendRedirect("../login.jsp");
        }else {
            resp.sendRedirect("../login.jsp");
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}