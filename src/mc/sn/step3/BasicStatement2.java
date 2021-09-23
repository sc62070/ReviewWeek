package mc.sn.step3;

public class BasicStatement2 {
	// 1부터 주어지는 수까지의 합을 구해서 리턴하는 메소드를 선언하고 코드를 작성하세요
	// 메소드 이름은 getSum 나머지는 작성하는 사람이 결정해서 합니다.
	public int getSum(int number) {
		int result = 0;
		int sum = 0;
		for(int i=0;i<number;i++) {
			sum = sum + (i+1);
		}
		result = sum;
		return result;
	}
	
	
	
	
	public void viewMonth(int month) {
		// 2021년의 월 정보를 받아서 해당 월의 달력을 출력하는 코드를 작성하시오
		int year = 2021;
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] spaces = {5,1,1,4,2,6,4,0,3,5,1,3};
		
		int space = spaces[month-1];
		int lastDay = lastDays[month-1];
		
		System.out.println(year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=0;i<space;i++) {
			System.out.print("\t");
		}
		for(int i=0;i<lastDay;i++) {
			int day = i+1;
			System.out.print(day+"\t");
			if((day+space)%7==0) { //day==7||day==14||day==21||day==28
				System.out.println();
			} 
		}
		
	}
	
	
	//정수 하나를 받아서 소수를 판별하여 논리값으로 결과를 리턴하는 메소드를 선언하시오
	//메소드 이름 : isPrimeNumber 나머지는 작성하는 사람이 결정해서 합니다.
	
	public boolean isPrimeNumber(int number) {
		boolean flag = false;
		
		
		return flag;
	}
}








