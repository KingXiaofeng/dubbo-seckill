package com.seckill.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wangxf on 2017/6/9.
 */
public class IndexController extends HttpServlet{

    public IndexController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Spring解析配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath*:dubbo/remote-provider.xml", "classpath*:dubbo/spring-dubbo.xml"});

        // 启动所有服务
        context.start();

        System.out.println("----------启动所有服务----------");

        // 防止乱码
        resp.setContentType("test/html;charset=UTF-8");

        try {
            System.in.read();
        } catch (IOException e) {
            PrintWriter writer = resp.getWriter();
            writer.println("<html><h1>服务开启失败---</h1></html>");
            writer.close();
            e.printStackTrace();
        }

        PrintWriter writer = resp.getWriter();
        writer.println("<html><h1>服务开启成功</h1></html>");
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
