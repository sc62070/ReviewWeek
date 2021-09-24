package mc.sn.step4;

//VO(Value Object), DTO(Data Transfer Object), DataBean
public class Account {
	private int balance;
	private String ano;
	private String owner;
	
	public Account() {
		
	}
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner =owner;
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAno() {
		return ano;
		
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return this.ano+", " +this.owner+", "+this.balance;
	}
}


