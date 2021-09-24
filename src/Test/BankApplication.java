package mc.sn.step4;

import java.util.Scanner;

public class BankApplication {
	private Account[] accounts;
	public BankApplication() {
		this.accounts = new Account[10];
	}

	public static void main(String[] args) {
		
	public void openBank() {
		
		public void accountList() {
			//배열에 있는 계좌 객체를 꺼내서 출력
			for(int i=0;i<accounts.length;i++) {
				Account temp =accounts[i];
				System.out.println(temp);
			}
		}
		public void displayMenu() {
			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성|2.계좌조회|3.계좌입금|4.계좌출금|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택 >>> ");
		}
		}
	}
	}