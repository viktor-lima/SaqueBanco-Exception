package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer nunber;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(Integer nunber, String holder, Double balance, Double withdrawLimit) {
		super();
		this.nunber = nunber;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNunber() {
		return nunber;
	}

	public void setNunber(Integer nunber) {
		this.nunber = nunber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void WithdrawLimit(Double withdrawLimit, Double amount) {
		this.withdrawLimit = withdrawLimit; 
	}
	
	public void deposit(Double amount ) {
		balance += amount;
	}
	public void withdraw(Double amount) {
		if(amount > withdrawLimit) {
			throw new DomainException("the amount esceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainException("not enough balance");
		}
		balance -= amount;
	}

	

	
	
	
}
