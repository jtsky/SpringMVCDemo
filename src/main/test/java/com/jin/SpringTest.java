package com.jin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("global-servlet.xml");
        // 判断两次请求 singleton 作用域的 Bean 实例是否相等
        System.out.println(ctx.getBean("bean1") == ctx.getBean("bean1"));
        // 判断两次请求 prototype 作用域的 Bean 实例是否相等
        System.out.println(ctx.getBean("bean2") == ctx.getBean("bean2"));
    }
}
