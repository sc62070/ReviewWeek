package mc.sn.lotto.v2;

public class LottoBall {
	private int ballNumber;
	private boolean isSelected;

	public LottoBall(int number) {
		this.ballNumber = number;
	}
	
	public int getBallNumber() {
		return this.ballNumber;
	}
	public void setBallNumber(int ballNumber) {
		this.ballNumber = ballNumber;
	}
	public boolean getSelected() {
		return this.isSelected;
	}
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
	public String toString() {
		return String.valueOf(ballNumber);
	}
}
	