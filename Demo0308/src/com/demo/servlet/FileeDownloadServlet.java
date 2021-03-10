package com.demo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/*
 *  作者：zhuangjiexin
 *  时间：2021/1/13 10:26
 *  描述：
 */
@WebServlet(name = "FileeDownloadServlet",urlPatterns = "/fileDownload.do")
public class FileeDownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OutputStream outputStream = response.getOutputStream();
        File file = new File("D:\\1.jpg");

        response.setHeader("content-disposition","attachment;fileName="+"abc.jpg");
        InputStream inputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int length = 0;
        while((length=inputStream.read(buffer))!=-1){
            outputStream.write(buffer);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
