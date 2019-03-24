package com.itheima.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: spring_day01
 * @BelongsPackage: com.itheima.ui
 * @Author: Administrator
 * @CreateTime: 2019-03-08 15:03
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    }
}
