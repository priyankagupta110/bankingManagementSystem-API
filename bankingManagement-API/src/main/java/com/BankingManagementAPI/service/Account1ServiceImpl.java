package com.BankingManagementAPI.service;

import com.BankingManagementAPI.repository.Account1Repository;

public class Account1ServiceImpl implements Account1Service {

    public Account1Repository account1Repository;

    public Account1ServiceImpl(Account1Repository account1Repository) {
        this.account1Repository = account1Repository;
    }
}
