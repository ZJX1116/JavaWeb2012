package com.demo.xml;

import javax.servlet.*;
import java.io.IOException;

/*
 *  作者：zhuangjiexin
 *  时间：2021/1/13 10:26
 *  描述：
 */
public class Helloservlet implements  Servlet{

    public Helloservlet(){
        System.out.println("HelloServlet无参构造函数");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("HelloServle被初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloServlet被访问");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("HeLLoServlet被摧毁");
    }
}
