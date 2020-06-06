package com.william.service.impl;

import com.william.dao.IAccountDao;
import com.william.domain.Account;
import com.william.service.IAccountService;

import java.util.List;


/**
 * 账户业务层的实现类
 */
public class AccountAserviceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public void saveAccount(Account account) {

        accountDao.saveAccount(account);

    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);

    }

    public void deteleAccount(Integer id) {
        accountDao.deteleAccount(id);

    }
}
