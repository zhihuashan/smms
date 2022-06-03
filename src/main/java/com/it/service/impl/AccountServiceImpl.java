package com.it.service.impl;

import com.it.dao.AccountDao;
import com.it.domain.Account;
import com.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//将AccountServiceImpl注入到容器
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户");
        List<Account> studentList = accountDao.findAll();
        return studentList;
    }

    @Override
    public int saveAccount(Account account) {
        System.out.println("业务层：保存所有账户");
        int i = accountDao.saveAccount(account);
        return i;
    }
}
