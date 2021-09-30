package mc.sn.lotto.v2;

import java.util.ArrayList;

public class Studio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//onAir메도스 호출하는 코드 작성
		Studio st = new Studio();
		st.onAir();
	}
	public void onAir() {
		System.out.println("지금부터 로또 추첨을 시작합니다.");
		ArrayList<LottoBall> balls = this.makeBalls();
		LottoMachine machine = new LottoMachine(balls);
		machine.getBalls(6);
		System.out.println("감사합니다.");
	}
	private ArrayList<LottoBall> makeBalls() {
		ArrayList<LottoBall> balls = null;
		balls = new ArrayList<LottoBall>();
		for(int i=0;i<45;i++) {
			balls.add(new LottoBall(i+1));
		}
		
		return balls;
	}

}
