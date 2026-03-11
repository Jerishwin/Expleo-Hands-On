package com.HandsOn;

class Account{
	
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void credit(int amount) {
		balance+=amount;
	}
	
	public void debit(int amount) {
		if(amount>balance) {
			System.out.println("Amount exceeded balance");
			return;
		}
		balance-=amount;
	}
	
	public void transfer(Account another,int amount) {
		if(amount>balance) {
			System.out.println("Amount exceeded balance");
			return;
		}
		balance-=amount;
		another.balance+=amount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}

public class AccountManagementSystem {

	public static void main(String[] args) {
		
		Account A1 = new Account("A1","Jack",3400);
		Account A2 = new Account("A2","Bob");
		
		A1.transfer(A2, 1000);
	}

}
