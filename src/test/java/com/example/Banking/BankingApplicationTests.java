package com.example.Banking;

import com.example.Banking.dto.AccountDto;
import com.example.Banking.entity.Account;
import com.example.Banking.repository.AccountRepository;
import com.example.Banking.service.AccountService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootTest
@EnableWebMvc
class BankingApplicationTests {

	@Mock
	private AccountRepository accountRepository;
	@InjectMocks
	private AccountService accountService;

	private MockBean mockBean;
@Test
	public void saveAccountTest()
	{
		AccountDto accountDto = new AccountDto();
		accountDto.setBalance(1222);
		accountDto.setAccountHolderName("Name");

	}

}
