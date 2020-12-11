package ch07;

public class Bank {
	//1. 필드
	private String account;
	private static int balance;
	
	public Bank() {}
	
	//생성자= 초기화 - 계좌번호("123-456", 0원)
	public Bank(String account, int balance) {
		this.account = account;
		this.balance = balance;
		showinfo();
		
	}
	//getter, setter
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Bank.balance = balance;
	}
	//메소드
	//입금
	public void deposit(int amount) {
		//balance = balance + amount;  잔액(10000)=0+10000 - 반복x
		balance += amount;
		System.out.println(amount + "원이 입금 되었습니다. ");
	}
	//출금
	public void withdraw(int amount) {
		//balance = balance - amount; 
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. ");
}
	//잔액표시
	public void showinfo() {
		System.out.println("계좌번호는 : " + this.getAccount());
		System.out.println("잔액은 : "+ this.getBalance() + "원");
		}
}