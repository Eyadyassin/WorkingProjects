package com.arabbank.microservices.accounts.model;


public class Account {
	
	private String accountNumber;
	private float availableBalance;
	private String nickName;
	
	public Account() {
	}
	
	public Account(String accountNumber, float availableBalance, String nickName) {
		super();
		this.accountNumber = accountNumber;
		this.availableBalance = availableBalance;
		this.nickName = nickName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(float availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return String.format("Account Number [%s], Available Balance [%s], Nick Name [%s],",getAccountNumber(),getAvailableBalance(),getNickName());
	}
	
}
