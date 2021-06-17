package com.yaozhou.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by WXHang on HANG at 2021/6/17 22:25
 * @author HANG
 */
public class OnlineCountListener implements HttpSessionListener {
    /**
     * 创建session监听，查看你的一举一动
     * @param se
     *
     * 一旦创建session就会触发一次这个事件
     */
    public void sessionCreated(HttpSessionEvent se) {
        //利用session获取在线人数
        ServletContext servletContext = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        //手动销毁sssion
        //se.getSession().invalidate();
        //配置session失效时间
        Integer Onlinecount = (Integer) servletContext.getAttribute("OnlineCount");
        if (Onlinecount == null){
            Onlinecount = new Integer(1);
        }else {
            int count = Onlinecount.intValue();
            Onlinecount = new Integer(count + 1);
        }
        servletContext.setAttribute("OnlineCount",Onlinecount);

    }

    /**
     * 销毁session监听
     * @param se
     * 一旦销毁session这个监听，那么就会触发一次这个事件
     */

    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        //手动销毁sssion
        //se.getSession().invalidate();
        //配置session失效时间
        Integer Onlinecount = (Integer) servletContext.getAttribute("OnlineCount");
        if (Onlinecount == null){
            Onlinecount = new Integer(1);
        }else {
            int count = Onlinecount.intValue();
            Onlinecount = new Integer(count - 1);
        }
        servletContext.setAttribute("OnlineCount",Onlinecount);
    }
}