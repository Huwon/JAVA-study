package ch07;

public class BankEx {

	public static void main(String[] args) {
		//계좌생성(생성자)
		Bank bank = new Bank("123-456", 0); //처음값 생성
		
		//잔액 표시-showinfo();
		bank.showinfo();
		
		//입금-deposit();
		System.out.println();
		bank.deposit(10000);
		
		//출금-withdraw
		bank.withdraw(5000);
		
		

	}

}
