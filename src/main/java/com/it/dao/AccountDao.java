package com.it.dao;

import com.it.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
//账户dao接口
public interface AccountDao {
    // 查询所有账户
    public List<Account> findAll();
    // 保存账户信息
    public int saveAccount(Account account);
}
