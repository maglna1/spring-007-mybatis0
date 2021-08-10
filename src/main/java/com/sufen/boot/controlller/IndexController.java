package com.sufen.boot.controlller;

import com.sufen.boot.bean.Account;
import com.sufen.boot.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {


    @Autowired
    AccountServiceImpl accountService;


    @ResponseBody
    @GetMapping("/acctByAnno")
    Account getAcctByAnno(@RequestParam("id") Integer id){
        return accountService.getAcctByAnno(id);
    }

    @ResponseBody
    @GetMapping("/acctByXml")
    Account getAcctByXml(@RequestParam("id") Integer id){
        return accountService.getAcctByXml(id);
    }

    @ResponseBody
    @PostMapping("saveAcct")
    void saveAcct(Account account){
        accountService.saveAcct(account);
    }
//    @ResponseBody
//    @PostMapping("/acct")
////    @GetMapping("/acct")
//    Account getAcctPost(@RequestParam Integer id){
//        return accountService.getAcctByid(id);
//    }
}


