package com.sufen.boot.service.impl;

import com.sufen.boot.bean.Account;
import com.sufen.boot.mapper.AccountMapper;
import com.sufen.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account getAcctByAnno(Integer id) {
        return accountMapper.getAcctByAnno(id);
    }

    @Override
    public Account getAcctByXml(Integer id) {
        return accountMapper.getAcctByXml(id);
    }

    public void saveAcct(Account account){
        accountMapper.saveAcct(account);
    }
}
