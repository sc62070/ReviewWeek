package mc.sn.step2;

public class BasicStatement {
	// 2단을 출력하는 메소드를 작성하시오
	public void printTwo() {
		for(int i=0;i<9;i++) {
			int number = i+1;
		System.out.print("2"+number+"="+number*2);
	}
	}
	
	// 주어지는 단수만을 출력하는 메소드를 작성하시오
	public void printDan(int dan) {
			for(int i=0;i<9;i++) {
				int number = i+1;
			System.out.println(dan+"X"+number+"="+number*dan);
		
			}
		}
	
	//2~9단까지 모두 출력하는 메소드를 작성하세요
	public void printAllDan() {
		for(int i=0;i<8;i++) {
			int dan = i+2;
			this.printDan(dan);
		}
	}
	// 주어지는 두 수와 그사이에 있는 정수를 출력하는 메소드를 작성하시오
	public void printNumber(int num1, int num2) {
		//교환로직 작성하세요
		if(num1>num2) {
			int temp = num1;
			num1= num2;
			num2 = temp;
		}
		
		for(int i=num1;i<num2;i++) {
			System.out.println(i);
	
		}
}
}