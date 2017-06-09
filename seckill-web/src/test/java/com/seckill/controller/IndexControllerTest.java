package com.seckill.controller;

import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wangxf on 2017/6/9.
 */
public class IndexControllerTest extends TestCase {

    public static void main(String[] args) throws IOException {

        System.out.println("================================");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "classpath*:dubbo/remote-provider.xml","classpath*:dubbo/spring-dubbo.xml"});


        context.start();
        System.out.println("---------------start-service--------------");
        System.in.read();

        System.out.println("================================");
    }
}