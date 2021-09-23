package mc.sn.step3;

public class ReviewMainStep3 {
	
	public static void main(String[] args) {
		//아래의 test1메소드를 호출하는 코드를 작성하시오
		ReviewMainStep3 step3 = new ReviewMainStep3();
		step3.test1();
	}
	
	public void test1() {
		//BasicStatement2가 가지고 있는 메소드를 실행해서 결과를 출력하는 코드를 작성합니다.
		System.out.println("ok");
		BasicStatement2 basic2 = new BasicStatement2();
		//int result = basic2.getSum(100);
		//System.out.println(result);
		basic2.viewMonth(9);
	}
	
	
}
