package com.it.controller;

import com.it.domain.Account;
import com.it.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

//账户web
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(Model model){
        System.out.println("表现层：查询所有账户");
        List<Account> accountList =accountService.findAll();
        for(Account a:accountList){
            System.out.println(a);
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("accountList",accountList);
        mv.setViewName("list");
        return mv;
    }
    @RequestMapping("/save")
    public void save(Account account, Model model, HttpSession session){
        int i =accountService.saveAccount(account);
        System.out.println(i);
    }
}
