package com.example.Banking.service;

import com.example.Banking.dto.AccountDto;
import com.example.Banking.entity.Account;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
}
