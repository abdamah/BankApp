package com.riigsoft.account;

import com.riigsoft.beans.Balance;
import com.riigsoft.transaction.Transaction;

public class Deposit implements Transaction {
	private Balance balance = new Balance();
	@Override
	public void process(double amount) {
		if(amount>0 && amount<20000) {
			System.out.println("Amount :"+amount);
			balance.setBalance(balance.getBalance()+amount);
			System.out.println("Balance :"+balance.getBalance());
			System.out.println("Transaction Completed...");
		}else {
			System.out.println("Deposit Not Succeed!");
		}

	}
}
