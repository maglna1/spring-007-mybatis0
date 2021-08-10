package com.sufen.boot.service;

import com.sufen.boot.bean.Account;
import com.sufen.boot.mapper.AccountMapper;
import org.springframework.stereotype.Service;

public interface AccountService {
    Account getAcctByXml(Integer id);
    Account getAcctByAnno(Integer id);
    void saveAcct(Account account);
}
