package com.arabbank.microservices.accounts;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.arabbank.microservices.accounts.dao.AccountsDAO;
import com.arabbank.microservices.accounts.model.Account;

@RestController
public class AccountsController {
	
	
	private AccountsDAO accountsDAO = new AccountsDAO();
	
	@GetMapping ("/accounts")
	public List<Account> listAccounts() {
		return accountsDAO.listAccounts();
	}
	
	@GetMapping ("/account/{accountNumber}")
	public Account getAccounts(@PathVariable String accountNumber) {
		return accountsDAO.getAccount(accountNumber);
	}

}



