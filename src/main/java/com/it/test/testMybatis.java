package com.it.test;

import com.it.dao.AccountDao;
import com.it.domain.Account;
import com.it.util.initLogRecord;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {
//    public static Logger logger = Logger.getLogger(testMybatis.class);
    @Test
    public static void run1() throws Exception {
        initLogRecord.initLog();
        // 读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis.xml");
        // 根据配置文件构建SqlSessionFactory对象
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        // 通过SqlSessionFactory创建SqlSession对象
        SqlSession ss = ssf.openSession();
        // 获取到代理对象
        AccountDao accountDao = ss.getMapper(AccountDao.class);
//        查询所有数据
        List<Account> accountList = accountDao.findAll();
        for(Account ac:accountList){
            System.out.println(ac);
        }
        // 提交
        ss.commit();
        // 关闭
        ss.close();
        config.close();
    }

    @Test
    public  void run2() throws Exception{
        Account  account =  new Account();
        account.setName("熊大");
        account.setMoney(400d);
        // 读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis.xml");
        // 根据配置文件构建SqlSessionFactory对象
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
        // 通过SqlSessionFactory创建SqlSession对象
        SqlSession ss = ssf.openSession();
        // 获取到代理对象
        AccountDao accountDao = ss.getMapper(AccountDao.class);
//        保存
        accountDao.saveAccount(account);
        // 提交
        ss.commit();
        // 关闭
        ss.close();
        config.close();
    }
}
