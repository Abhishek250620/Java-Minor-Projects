package jspider;

public class BankImpl implements Bank{
	private int bal;
	BankImpl(int bal){
		this.bal=bal;
	}
	@Override
	public void deposite(int amt) {
		System.out.println("Depositing Rs."+amt);
		bal+=amt;
		System.out.println("Amount deposited successfully");
	}
	@Override
	public void withDraw(int amt) {
		if(amt<=bal) {
			bal-=amt;
			System.out.println("Amount withdraw successfully");
		}
		else {
			try {
				throw new InsuffeintBalException("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getBal() {
		return bal;
	}
	@Override
	public String errorMessage() {
		return "Inavlid choice Kindly enter valid choice!!!";
	}
}
