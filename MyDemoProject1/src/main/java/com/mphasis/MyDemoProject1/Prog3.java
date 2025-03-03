package com.mphasis.MyDemoProject1;

interface BankAcc{
	void deposit(int amt);
	void withdraw(int amt);
}

class SavingsAcc implements BankAcc{
	int bal;
	SavingsAcc(int b){
		bal=b;
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("The amount has been deposited successfully to your Savings Account..!");
		System.out.println("The remaining balance ="+bal);
	}
	public void withdraw(int amt) {
		if(bal>=amt) {
			bal-=amt;
			System.out.println("Please collect your cash..!");
		}
		else {
			System.out.println("Insufficient balance to withdraw");
		}
	}
}


class CheckingAcc implements BankAcc{
	int bal;
	CheckingAcc(int b){
		bal=b;
	}
	public void deposit(int amt) {
		bal+=amt;
		System.out.println("The amount has been deposited successfully to your Checking Account..!");
		System.out.println("The remaining balance ="+bal);
	}
	public void withdraw(int amt) {
		if(bal>=amt) {
			bal-=amt;
			System.out.println("Please collect your cash..!");
		}
		else {
			System.out.println("Insufficient balance to withdraw");
		}
	}
}


public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAcc s=new SavingsAcc(10000);
		s.withdraw(500);
		s.deposit(1000);
		CheckingAcc c=new CheckingAcc(5000);
		c.withdraw(6000);
		c.deposit(1000);
		c.withdraw(6000);
	}

}
