package com.yaozhou.listener;

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

    }

    /**
     * 销毁session监听
     * @param se
     * 一旦销毁session这个监听，那么就会触发一次这个事件
     */

    public void sessionDestroyed(HttpSessionEvent se) {

    }
}