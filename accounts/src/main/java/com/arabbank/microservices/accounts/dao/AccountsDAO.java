package com.arabbank.microservices.accounts.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.arabbank.microservices.accounts.model.Account;

public class AccountsDAO {
	
	private List<Account> accounts;
	public AccountsDAO() {
		accounts = new ArrayList <Account>();
		accounts.add(new Account("20201", 100, "Account 1"));
		accounts.add(new Account("30202", 200, "Account 2"));
		accounts.add(new Account("40203", 300, "Account 3"));
		accounts.add(new Account("50204", 400, "Account 4"));
		
	}
	
	public List<Account> listAccounts() {
		
		return accounts;
	}
	
	public Account getAccount (String accountNumber) {
		
		Iterator<Account> it = accounts.iterator();
		while (it.hasNext()) {
			
			Account act = (Account) it.next();
			System.out.println(">>> "+ accountNumber+"    "+act.getAccountNumber());
			if (act.getAccountNumber().equals(accountNumber))
				return act;
		}
		return null;
	}
}
