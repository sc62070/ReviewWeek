package mc.sn.lotto;

import java.util.Random;

public class LottoMachine {
	private LottoBall[] balls;
	public LottoMachine(LottoBall[] balls) {
		this.balls =balls;
	}
	
	public void getBalls(int max) {
		boolean flag = false;
		int count =0;
		LottoBall ball = null;
		while(!flag) {
			ball =this.getBall();
			if(!ball.getSelected()) {
				ball.setSelected(true);
				count++;
				System.out.println(ball);
			}
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
	public LottoBall getBall() {
		LottoBall ball = null;
		Random r = new Random();
		int rnd = r.nextInt(45);
		ball = balls[rnd];
		return ball;
	}
}
