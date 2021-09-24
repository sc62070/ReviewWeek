package mc.sn.step4;

import java.util.Scanner;

public class BankApplication {
	private Account[] accounts;
	private int index;
	public BankApplication() {
		this.accounts = new Account[10];
		this.index =0;
	}

	public static void main(String[] args) {
		//openBank를 호출하세요
		BankApplication bank = new BankApplication();//인스턴트가 만들어짐.
		bank.openBank();
	}

	//openBank 기본 메소드 만드세요.
	public void openBank() {
		System.out.println("은행업무를 시작합니다.");
	
		//키보드와 연결하는 코드 작성(키보드와 연결하는 클래스 이용) Scanner
		Scanner scan = new Scanner(System.in);
		//언제 빠져나올지 모르는 반복문
		boolean isClosed = false;
		while(!isClosed) {
			//displayMenu호출하세요
			this.displayMenu();
			//키보드로 부터 문자열데이터를 라인으로 입력받는 코드 작성
			String command = scan.nextLine();
			//System.out.println("입력받은 데이터 : " + command);
			if(command.equals("5")) {
				isClosed = true;
			} else if(command.equals("2")) {
				this.accountList();
			} else if(command.equals("1")) {
				this.createAccount(scan);
			} else if(command.equals("3")) {
				this.deposit(scan);
			} else if(command.equals("4")) {
				this.withdraw(scan);
			} 
		}
		scan.close();
		System.out.println("은행업무를 종료합니다.");
	}
	public void deposit(Scanner scan) { //입출금 금액은 입력 받아서 합니다.
		System.out.println("입금준비");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		//계좌번호 조회
		Account account = this.findAccount(ano);
		System.out.print("입금액: ");
		String temp = scan.nextLine();
		int amount = Integer.parseInt(temp);
		amount = account.getBalance() + amount;
		account.setBalance(amount);
		System.out.println("입금처리되었습니다.");
	}
	private Account findAccount(String ano) {
		Account result = null;
		for(int i=0;i<accounts.length;i++)
		{
			result = accounts[i];
			if(result!=null) {
				if(result.getAno().equals(ano)) {
					break;
				}
			}
		}
		return result;
	}
	public void withdraw(Scanner scan) {
		System.out.println("출금준비");
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		//계좌번호 조회
		Account account = this.findAccount(ano);
		System.out.print("출금액: ");
		String temp = scan.nextLine();
		int amount = Integer.parseInt(temp);
		amount = account.getBalance() - amount;
		account.setBalance(amount);
		System.out.println("출금처리되었습니다.");
	}
	
	public void createAccount(Scanner scan) {
		System.out.print("계좌번호: ");
		String ano = scan.nextLine();
		System.out.print("계좌주인: ");
		String owner = scan.nextLine();
		System.out.print("초기입금: ");
		String temp = scan.nextLine();
		int balance = Integer.parseInt(temp);
		this.accounts[index++] = new Account(ano, owner, balance);
		System.out.println("계좌가 생성되었습니다.");
	}
	public void accountList() {
		//배열에 있는 계좌 객체를 꺼내서 출력
		for(int i=0;i<accounts.length;i++) {
			Account temp =accounts[i];
			if(temp!=null) {
			System.out.println(temp);
			}
		}
	}
	public void displayMenu() {
		System.out.println("--------------------------------------");
		System.out.println("1.계좌생성|2.계좌조회|3.계좌입금|4.계좌출금|5.종료");
		System.out.println("--------------------------------------");
		System.out.print("선택 >>> ");
	}

}
