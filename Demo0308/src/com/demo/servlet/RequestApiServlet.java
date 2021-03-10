package com.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 *  作者：zhuangjiexin
 *  时间：2021/1/13 10:26
 *  描述：
 */
public class RequestApiServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("uri"+req.getRequestURI());
        System.out.println("url"+req.getRequestURL());
        System.out.println("客户端IP地址"+req.getRemoteHost());
        System.out.println("客户端getRemoteADDr" +req.getRemoteAddr());
        System.out.println("请求头"+req.getHeader("cookie"));
        System.out.println("请求方式"+req.getMethod());
    }
}
