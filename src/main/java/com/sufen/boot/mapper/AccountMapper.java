package com.sufen.boot.mapper;

import com.sufen.boot.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AccountMapper {

    @Select("select * from account_tbl where id=#{id}")
    Account getAcctByAnno(Integer id);


    Account getAcctByXml(Integer id);

    void saveAcct(Account account);
}
