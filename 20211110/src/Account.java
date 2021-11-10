
public class Account {
	String accountNo;
	String owner;
	int balance;

	// default 持失切
	public Account() {
	}

	// 持失切
	public Account(String accountNo, String owner, int balance) {
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	
		
	}

	//setter
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//getter
	public String getAccountNo() {
		return accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}
}
