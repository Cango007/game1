package com.example.Banking.impl;

import com.example.Banking.dto.AccountDto;

import com.example.Banking.entity.Account;
import com.example.Banking.mapper.AccountMapper;
import com.example.Banking.repository.AccountRepository;
import com.example.Banking.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);

       Account saveAccount=  accountRepository.save(account);
         return  AccountMapper.mapToAccountDto(saveAccount);
    }
}
