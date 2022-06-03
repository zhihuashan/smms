package com.it.test;

import com.it.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_spring {
    public static void main(String[] args) {
        // 获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中通过Id获取bean对象
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        //使用接口调用
        accountService.findAll();
    }
}
