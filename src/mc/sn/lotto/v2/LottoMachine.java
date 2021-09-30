package mc.sn.lotto.v2;

import java.util.ArrayList;
import java.util.Random;

public class LottoMachine {
	private ArrayList<LottoBall> balls;
	public LottoMachine(ArrayList<LottoBall> balls) {
		this.balls =balls;
	}
	
	public void getBalls(int max) {
		boolean flag = false;
		int count =0;
		LottoBall ball = null;
		while(!flag) {
			ball =this.getBall();
				System.out.println("이번 추첨공은 "+ball+"번 입니다.");
			count++;
			if(count==max) {
				flag=true;
			}
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int rnd = r.nextInt(balls.size());
		ball = balls.remove(rnd);
		return ball;
		
		//삭제 기능을 추가하세요
		
	}
}
